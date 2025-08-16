package dailypractice.july.july8;

import java.util.ArrayList;
import java.util.List;

/*
        int [] nums --> List<Integer>
        List<Integer> list = Arrays.stream(nums).mapToObj(Integer::valueOf).collect(Collectors.toList());

    //1 revese, Palidrom
    //2 revese a sentence , remove dublicate from string
    //3 2Sum
    //4- removeDublicates
    // -6 RemoveDublicates fromn array
    //-7 containsDuplicate
    // -8 SingleNumber
      // - 9 remove dublicates in sorterd
    // -10 print all sub arrays numbers

    // 11 print All sub arrays of Strings
    // -15     minSubArrayLen  ?????
    //-12 PrintAllSubArraysOfSizeK
    //- 13 isSubsequence
    //-14 duplicateZeros????????
    // define a matrix and initialix it
    // matrix : define ,
    -1 row by row ,
    -2 col by col,
    -3 diagnal
    -4 revese diagnal
    -5 isToeplitzMatrix?
    -6  Spiral?????
    -7 travese DFS
    -8 travers BFS
 */
public class ArraysString {
    public static void main(String[] args) {
        PrintSubArraysOfString("abc");
        SubArrayOfKSize(new int[]{1,2,3,4,5}, 3);
        System.out.println(isSubsequence("abcde", "ace"));   // true
        System.out.println(isSubsequence("abcde", "aec"));   // false
        PrintRowByRowMatrix(new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
        PrintMatrixColByCol(new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
        System.out.println();
        traveseDiagnaly(new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
        System.out.println();
        traveseReveseDiagnol(new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
    }
    public static void PrintSubArraysOfString(String str){
        //abc --. a , b, c ,ab ,ac, bc, abc
        List<List<String>> res = new ArrayList<>();
        for (int i = 0; i <str.length() ; i ++){
            for (int j = i; j< str.length() ; j++ ){
               List<String> subs = new ArrayList<>();
               StringBuilder sb = new StringBuilder();
               for (int k = i; k <= j ; k++){
                   sb.append(str.charAt(k));
                   subs.add(sb.toString());
               }
                res.add(subs);
            }
        }
        System.out.println(res);
    }
    public  static void SubArrayOfKSize(int [] nums, int size) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i <= nums.length - size; i++) {
            List<Integer> subs = new ArrayList<>();
            for (int j = i; j < i + size; j++) {
                subs.add(nums[j]);
            }
            res.add(subs);
        }
        System.out.println(res);
    }
    public static  boolean isSubsequence(String str , String sub){
        //abc , ab --> true
        //cab  ,ab -->
        if (sub == null || str == null) return false;
        int i = 0; // Pointer for sub
        int j = 0; // Pointer for str
        while (i < sub.length() && j < str.length()) {
            if (sub.charAt(i) == str.charAt(j)) {
                i++; // Move in sub if there's a match
            }
            j++; // Always move in str
        }
        return  i == sub.length();
    }
    public static void DublicateZeros(int [] nums){
        //dublicates and shift to the right  Input: arr = [1,0,2,3,0,4,5,0] Output: [1,0,0,2,3,0,0,4]
        int number_of_zeros =0;
        for (int a : nums){
            if(a ==0) number_of_zeros ++;
        }
        for (int i = nums.length-1 , j = nums.length -1 + number_of_zeros;i< j; i--, j--){
            if(j < nums.length) nums[j] = nums[i];
            if(nums[i] ==0)
                if(--j < nums.length) nums[j] = nums[i];
        }
    }
    public static void InitializeMatrix(){
        int[][] matrix1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
    }
    public static void PrintRowByRowMatrix(int [][] matrix){
      int rows = matrix[0].length;
      int cols = matrix.length;
      for (int row = 0; row< rows ; row++ ){
          for (int col = 0; col< cols ; col ++){
              System.out.println(matrix[row][col]);
          }
      }
    }
    public static void PrintMatrixColByCol(int [][] matrix){
        int rows = matrix[0].length;
        int cols = matrix.length;
        for (int col = 0; col < cols; col++){
            for (int row = 0; row< rows; row ++){
                System.out.println(matrix[row][col]);
            }
        }
    }
    public static void traveseDiagnaly(int [][] matrix){
        int rows = matrix[0].length;
        for (int row = 0; row < rows ; row++){
            System.out.print(matrix[row][row]);
        }
    }
    public  static  void traveseReveseDiagnol(int [][] matrix){
        for (int col = 0 ; col < matrix.length ; col ++){
            System.out.print(matrix[col][matrix.length -1 - col]);
        }
    }
}
