package dailypractice.july.july7;
//group anagrom

//array initiate
import java.util.*;

/*
To memorize
   System.out.println(Arrays.toString(nums));

 */
//-7 containsDuplicate
// - 9 remove dublicates in sorterd
// -8 SingleNumber
// -10 print all sub arrays
public class ArraysStrings {
    public static void main(String[] args) {
        //-6 groupAnagrams(new String[] { "apple", "banana", "orange", "kiwi" });
        GroupAnagrom(new String[] { "apple", "banana", "orange", "kiwi" });
        // -7 RemoveDublicates fromn array
        removeDublicateSortedArray(new int[]{1,1,2,2,3,4,4,4,5});
        // -8 remove dublicates from an array of not sorted values!
        removedublicatedNotSortedArray(new int[] {1,2,2,3,1,4,5,1,2,5,3,3});
        removedublicatedNotSortedArray2(new int[] {1,2,2,3,1,4,5,1,2,5,3,3});
        //-9
        containsDublicates(new int[]{1,2,3,1,2,3,4});
        System.out.println(containsDublicates(new int[]{1,2,3}));
        // -10
        printAllSubArray(new int[]{1,2,3});
    }
    public static void GroupAnagrom (String [] str){
        for(int i = 0; i < str.length -1 ; i ++ ){
            StringBuilder sb = new StringBuilder(str[i]);
            str[i] =sb.reverse().toString();
        }
        System.out.println(Arrays.asList(str));
    }
    public static void removeDublicateSortedArray(int [] nums){
        // 1 ,2,2,3,4,4,5 --> 1,2,3,4,5
        List<Integer> res = new ArrayList<>();
        int Index = 1;
        res.add(nums[0]);
        for (int i = 1; i < nums.length  ; i ++){
            nums [Index] = nums[i];
            if(nums[Index] != nums[Index -1]){
                Index ++;
                res.add(nums[i]);
            }
        }
        System.out.println(res);
    }
    public  static  void removedublicatedNotSortedArray(int [] nums){
        //1, 2,3,,4,1 ,5,1, 4 --> 1,2,3,4,5
        /*
         list of res
        loop through
            put in the map : 1 :3, 2 :1,
            if map.value = 1
                res.add()
         */
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> res = new ArrayList<>();
        for(int i = 0; i<=nums.length -1 ;i++){
            map.put(nums[i], map.getOrDefault(nums[i],0) + 1);
            if(map.get(nums[i]) == 1)
                res.add(nums[i]);
        }
        System.out.println(res);

    }
    public  static  void removedublicatedNotSortedArray2(int [] nums){
        //1, 2,3,,4,1 ,5,1, 4 --> 1,2,3,4,5
        /*
         list of res
        loop through
            put in the map : 1 :3, 2 :1,
            if map.value = 1
                res.add()
         */
        List<Integer> res = new ArrayList<>();
        Set<Integer> seen = new HashSet<>();
        for(int i = 0; i<=nums.length -1 ;i++){
            if(seen.add(nums[i])){
                res.add(nums[i]);
            }
        }
        System.out.println(res);
    }
    public  static boolean containsDublicates(int [] nums){
        //1, 2,3,,4,1 ,5,1, 4 --> 1,2,3,4,5
        List<Integer> res = new ArrayList<>();
        Set<Integer> seen = new HashSet<>();
        for(int i = 0; i<=nums.length -1 ;i++){
            if(!seen.add(nums[i])){
                System.out.println("Array contains dublicates and the dublicated number is " + nums[i]);
                return true;
            }

        }
        return false;
    }
    public  static void printAllSubArray(int [] nums){
        // 123 --> [1] ,[ 2] ,[ 3 ]- [1,2 ][3] - [1,3] [2] - [1],[ 2,3 , 1
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0 ; i < nums.length;i++){
            for (int j = i  ; j < nums.length; j++){
                List<Integer> sub = new ArrayList<>();
                for(int k = i; k <=j ; k ++){
                    sub.add(nums[k]);
                }
                res.add(sub);
            }
        }
        System.out.println(res);
    }

}
