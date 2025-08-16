package dailypractice.jun;

import java.util.*;
//--1 Define and initialte array list in one line !!!!new ArrayList<> (Arrays.asList(2, 7, 11, 13)
//create an array of int and initialize it!
// Reverse Strings---> String.valueOf(chars)
//Revese numbers
// is Anagram
//
public class june24 {
    public static void main(String[] args) {
        //revieve an array and find the complet as target
        System.out.println(Arrays.toString(TwoSum(new ArrayList<>(Arrays.asList(2, 7, 11, 13)), 9)));
        ReverseString("hello");
        ReverseNums(new int[]{1,2,3,4});
        System.out.println(isAnagram("hellp"));
        System.out.println(isAnagram("alla"));
    }
//2, 7, 11, 13 --> 9
    public static int [] TwoSum(List<Integer> arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.size() ; i ++) {
            int complement = target - arr.get(i);
            if (map.containsKey(complement)) { // searching for 7
                return new int[]{map.get(complement), i};
            }
            map.put(arr.get(i), i);//{2:0}
        }
        return null;
    }
    public static void ReverseString (String str){
        int i = 0;
        int j = str.length()-1;
        char [] chars = str.toCharArray();
        while (i < j){
            char temp = str.charAt(i);
            chars[i]= str.charAt(j);
            chars[j] = temp;

            i ++;
            j --;
        }
        System.out.println("the reversed String is : " + String.valueOf(chars));
    }

    public static void ReverseNums(int [] nums){
        int i = 0;
        int j = nums.length - 1 ;
        while(i < j){
            int temp = nums[i];
            nums[i] = nums [j];
            nums[j] = temp;

            i ++;
            j --;
        }
        System.out.println(Arrays.toString(nums));
    }
    public static boolean isAnagram(String str){
        int i = 0;
        int j = str.length()-1;
        while (i < j){
           if(str.charAt(i) != str.charAt(j)) return false;
            i ++;
            j --;
        }
        return true;
    }

}
