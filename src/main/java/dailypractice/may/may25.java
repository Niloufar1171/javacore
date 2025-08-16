package dailypractice.may;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public class may25 {
    public static void main (String [] args){
        System.out.println("I reach the end of my practice");
    }

    public static int [] intersect(int[] nums1 , int[] nums2){
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0 , j = 0, k = 0;
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] < nums2[j]) i++;
            else if (nums1[i] > nums2[j]) j ++ ;
            else {
                nums1[k] = nums1[i];
                k++;
                i++;
                j++;
            }
        }
        return Arrays.copyOfRange(nums1, 0, k);
    }
    public static int [] plusOne(int [] digits){
       for(int i = digits.length -1 ; i >=0 ; i--){
           if(digits[i] == 9) digits[i] = 0;
           else{
               digits[i] ++;
               return  digits;
           }
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
    public static int[] moveZeroes(int [] nums) {
        int insertIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[insertIndex];
                nums[insertIndex] = temp;
                insertIndex++;
            }
        }
        return nums;
    }
    public static int [] twoSum(int [] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i =0; i< nums.length; i++){
            if(map.containsKey(target- nums[i])){
                return new int []{ map.get(target- nums[i]), i };
            }
            map.put(nums[i],i);
        }
        return null;
    }
    public static void reversString(char [] s){
        int i = 0;
        int j = s.length -1 ;
        while (i< j) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i ++;
            j --;
        }
    }
    public static int Reverse(int x){
        StringBuilder sb = new StringBuilder().append( Math.abs(x)).reverse();
        return Integer.parseInt(sb.toString());
    }
}

