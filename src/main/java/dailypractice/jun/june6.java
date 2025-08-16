package dailypractice.jun;

import java.util.*;

public class june6 {
    public static void main(String[] args) {
        System.out.println(RemoveDublicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));
        System.out.println(Arrays.toString(RotateArray(new int[]{1, 2, 3, 4, 5, 6, 7}, 3)));
        System.out.println(ContainsDublicats(new int[]{1, 1, 2, 3, 3}));
        System.out.println("Find The Single Number : " + SingleNumber(new int[]{1, 1, 3}));
        System.out.println("Intersections : " + Arrays.toString(IntersectionOfTwoArrays(new int[]{1, 2, 3, 4}, new int[]{2, 3})));
        System.out.println("Remove All zeros to the back" + Arrays.toString(MoveZeroes(new int [] {0,0,1,2,3} )));
        System.out.println("Find the target value : " + Arrays.toString(TwoSum(new int [] {2,7,11,15}, 9)));
        System.out.println("Reverse String 2 : " +ReverseString2(new char[]{'n','i','l','o','u','f','a','r'}));
    }

    public static int RemoveDublicates(int[] nums) {
        int InsertIndex = 1;
        for (int i = 1; i < nums.length; i++) {
            nums[InsertIndex] = nums[i];
            if (nums[InsertIndex] != nums[InsertIndex - 1]) InsertIndex++;
        }
        System.out.println(Arrays.toString(nums));
        return InsertIndex;
    }

    public static int BestTimeToBuyAndSell(int[] nums) {
        int maxprofit = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1])

                maxprofit = maxprofit + nums[i] - nums[i - 1];
        }
        return maxprofit;
    }

    public static int[] RotateArray(int[] nums, int k) {
        int[] res = new int[nums.length];
        //5.6.7.1.2.3.4: 1 2 3,4,5,6,7 --> 7.6.5.4.3.2.1 --> 5.6.7
        k = k % nums.length;
        HelperToReverse(nums, 0, nums.length - 1);
        HelperToReverse(nums, 0, k - 1);
        HelperToReverse(nums, k, nums.length - 1);
        return nums;
    }

    public static int[] HelperToReverse(int[] nums, int l, int h) {
        while (l < h) {
            int temp = nums[l];
            nums[l] = nums[h];
            nums[h] = temp;
            l++;
            h--;
        }
        return nums;
    }

    public static boolean ContainsDublicats(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (!seen.add(num)) return true;
        }
        return false;
    }

    public static int SingleNumber(int[] nums) {
        int res = -1;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int num : nums) {
            if (map.get(num) == 1)
                return num;
        }
        return res;
    }

    public static int[] IntersectionOfTwoArrays(int[] num1, int[] num2) {
        Arrays.sort(num1);
        Arrays.sort(num2);
        int i = 0, j = 0, k = 0;
        while (i < num1.length && j < num2.length) {
            if (num1[i] < num2[j]) i++;
            else if (num1[i] < num2[j]) j++;
            else {
                num1[k] = num1[i];
                j++; i++; k++;
            }
        }
        return Arrays.copyOfRange(num1, 0, k);
    }
    public static int [] MoveZeroes(int [] nums){
       int  InsertIndex = 0;
        for(int i = 0 ; i < nums.length; i++) {
           if(nums[i] != 0) {
               int temp = nums[i];
               nums[i] = nums[InsertIndex];
               nums[InsertIndex] = temp;
               InsertIndex++;
           }
        }
        return nums;
    }
    public static int[] TwoSum(int [] nums, int target){
        int [] res = new int[nums.length];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i =0; i< nums.length; i++){
            if(map.containsKey(target - nums[i] )){
                return new int []{i , map.get(target -nums[i])};
            }
        map.put(nums[i], i);
        }
        return  res;
    }
    public static String ReverseString(String str){
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
    public static  String ReverseString2(char[] s){
        int i = 0;
        int j = s.length - 1;
        while(i<j){
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i ++;
            j--;
        }
        return Arrays.toString(s);
    }

}