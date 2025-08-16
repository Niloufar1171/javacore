package dailypractice.jun;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class june2 {
    public static void main(String [] args){
        System.out.println("Hello");
        System.out.println("the max consecutives are : " + findMaxConsecutivesOnes( new int [] {1,1,1,0,1,1}) );
    }
    //max consecutives 1,2,3, ngext greater
    public static int findMaxConsecutivesOnes(int [] nums){
        int counter =0, maxcount = 0;
        for(int num : nums){
            if (num == 1) counter ++;
            else {
                maxcount= Math.max(maxcount,counter);
                counter =0;
            }
        }
        return maxcount = Math.max(maxcount,counter);
    }
    public static int findMaxconsecutivesOncesWithFlip(int [] nums, int k) {
        int l = 0, r;
        //int k = 2; for only 1 flip and k < = 0
        for(r = 0; r < nums.length; r ++){
            if(nums[r] == 0){
                k --;
            }
            if(k<0){
                k= k - nums[l];
                k ++;
                l++;
            }
        }
        return r- l;
    }
    public static boolean isConsecutive(int [] nums){
        Arrays.sort(nums);
        int n=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=n)
                return false;
            n++;
        }
        return true;
    }
    public static int [] nextGreaterElement(int[] nums1 , int [] nums2 ){
        int [] res = new int[nums1.length];
        Stack<Integer> stack = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i< nums2.length; i++) {
            while (!stack.empty() && nums2[i] > stack.peek()) {
                map.put(stack.pop(), nums2[i]);
            }
            stack.push(nums2[i]);
        }
        while (!stack.empty()) map.put(stack.pop(), -1);
        for(int i = 0; i < nums1.length; i ++){
            res[i] = map.get(nums1[i]);
        }
        return res;
    }
    public static int [] nextGReaterElements(int [] nums){
        int [] res = new int [nums.length];
        Stack<Integer> stack = new Stack<>();

        for(int i = 2 * nums.length -1 ; i >=0; i--){
            while(!stack.empty() && nums[stack.peek()] <= nums[i % nums.length]) stack.pop();

        res[i % nums.length] = stack.empty() ? -1 : nums[stack.peek()];
        stack.push(i% nums.length);
        }
        return res;
    }
    public static int maxpoew(String s){

        int res =1, counter = 1;
        for(int i = 0; i < s.length() -1 ; i ++){
            if(s.charAt(i) == s.charAt(i++)) counter++;
            else{
                res= Math.max(res,counter);
                counter ++;
            }
        }
        return res;

    }
}
