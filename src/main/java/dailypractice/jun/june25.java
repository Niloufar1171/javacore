package dailypractice.jun;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class june25 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(TwoSum(new int[]{2, 7, 11, 13}, 9)));
        PrintReverseString("hello");
        System.out.println(  isAnagram("Niloufar"));
        System.out.println(  isAnagram("ala"));
    }
    // 2 ,7, 11, 13
    public static int [] TwoSum(int [] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i ++){
            int complete = target - nums[i];
            if(map.containsKey(complete)){
                return  new int[]{map.get(complete), i};
            }
            map.put(nums[i], i);
        }
        return  null;
    }

    public static void PrintReverseString(String str){
        int i = 0;
        int j = str.length() -1 ;
        char [] chars = str.toCharArray();
        while(i < j){
            char temp = str.charAt(i);
            chars[i] = str.charAt(j);
            chars[j] = temp;

            i ++;
            j --;
        }
        System.out.println(String.valueOf(chars));
    }
    public static boolean isAnagram(String str){
        int i =0;
        int j = str.length() -1;
        while(i < j){
            if(str.charAt(i) != str.charAt(j)) { return false; }
            i ++;
            j--;
        }
        return  true;
    }
}
