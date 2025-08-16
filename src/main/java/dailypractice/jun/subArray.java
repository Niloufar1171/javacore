package dailypractice.jun;

import javax.swing.plaf.IconUIResource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class subArray {
    public static void main (String [] args)

    {
    //    System.out.println(ReverseString(new char[]{'a','b','c'}));
     //   System.out.println(Arrays.toString(SquaresOfArray(new int[]{1, 2, 3, 4, 5})));
       // System.out.println(PrintAllSubArray(new int [] {1,2,3,4}));
       // System.out.println(PrintAllSubArrayOfString(new String[] {"a","b","c","d"}));
        System.out.println(PrintAllSunArraysOfSizeK(new int [] {1, 2, 3, 4, 5}, 3));
    }
    public static char[] ReverseString(char [] str){
        int i =0;
        int j = str.length - 1;
        while(i < j) {
            char temp = str[i];
            str[i] = str[j];
            str[j] = temp;
            i ++;
            j--;
        }
        System.out.println(str);
        return str;
    }
    public static int [] SquaresOfArray(int [] arr){
        for(int i = 0; i< arr.length ;  i++) {
            arr[i] *=arr[i];
        }
        return arr;
    }
    public static int MaxAveOfSubArray(int [] nums){
       int res = 0;
        return res;
    }
    public static List<List<Integer>> PrintAllSubArray(int [] nums){
        List<List<Integer>> subArray = new ArrayList<>();
        List<Integer> list = Arrays.stream(nums).mapToObj(Integer::valueOf).collect(Collectors.toList());

        for (int i =0; i < nums.length ; i++){
            System.out.println("LOOP i : **********************************************************");
            System.out.println("i is : " + i );
           for( int j = i; j <nums.length; j ++){
               System.out.println("LOOP j : **********************************************************");
               List<Integer> subs = new ArrayList<>();
               System.out.println("j is : " + j );
               for(int k = i; k<= j ; k++){
                   System.out.println("k is : " + k );
                   System.out.println("nums[k] : " + nums[k]);
                   subs.add(nums[k]);
                   }
               System.out.println(subs);
               subArray.add(subs);
               }
        }
        return subArray;
    }
    public static List<List<String>> PrintAllSubArrayOfString( String [] str){
        List<List<String>> subArray = new ArrayList<>();
        for(int i = 0; i < str.length; i ++){
            for(int j = i; j<str.length; j++){
                List<String> subs= new ArrayList<>();
                for (int k = i; k<=j; k++){
                    subs.add(str[k]);
                }
                subArray.add(subs);
            }
        }
        return subArray;
    }
    public static List<List<Integer>> PrintAllSunArraysOfSizeK(int [] nums, int k){
        List<List<Integer>> subArray = new ArrayList<>();
        List<Integer> list = Arrays.stream(nums).mapToObj(Integer::valueOf).collect(Collectors.toList());
        for (int i =0; i < nums.length ; i++){
            for( int j = i; j <nums.length; j ++){
                List<Integer> subs = new ArrayList<>();
                for(int x = i; x<= j ; x++){
                    subs.add(nums[x]);
                }
               if(subs.size() == k)
                subArray.add(subs);
            }
        }
        return subArray;
    }
}

