package dailypractice.may;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class may24 {
    public static void main (String args[]){
    }
//-------------------------------------------------------------------------
// Reviewing Inteview Questions
    public static int removeDublicate(int [] nums){
        if(nums.length == 0 ) return 0;

        int insertIndex = 1;
        for(int i = 1 ; i < nums.length ; i ++){
            nums[insertIndex] = nums[i];
            if(nums[insertIndex]  != nums[insertIndex - 1]) insertIndex++;
        }
        return  insertIndex;
    }
    public static int maxProfit(int [] prices){
        int maxPrice = 0;
        for(int i = 1 ; i < prices.length ; i ++) {
            if( prices[i] > prices[i - 1 ]) //I do have a profit
                maxPrice = maxPrice + prices[i] - prices[i-1];
        }
        return maxPrice;
    }
    public static  void rotate(int [] nums, int k){
    //res : 4,5,6, 1,2,3==> 1, 2, 3, 4, 5, 6 => 6,5,4,3,2,1 ==> 4,5,6, 3,2,1 ==> 4,5,6 1,2,3
    reverse(nums,0, nums.length -1 );
    reverse(nums, 0, k -1 );
    reverse(nums,k, nums.length -1);
    }
    public static void reverse(int [] nums, int start, int end){
        while (start < end ){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    public static boolean containsDublicates(int [] nums){
        Set<Integer> seen= new HashSet<>();
        for(int num : nums){
            if( !seen.add(num))
                return true;
        }
        return false;
    }
    public static int singleNumber(int [] nums){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums ){
            map.put(num, map.getOrDefault(num,0) + 1 );
        }
        for(int i : nums){
            if (map.get(i) == 1 ){
                return i;
            }
        }
        return 0;
    }
}
