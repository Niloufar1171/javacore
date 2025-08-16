package dailypractice.may;

import net.bytebuddy.description.field.FieldDescription;

import javax.persistence.criteria.CriteriaBuilder;
import javax.security.auth.callback.CallbackHandler;
import java.util.*;

public class may31 {
    public static void main (String args[]){
    }
    //Array Sums, 3sums, ksums- Sub
    public int [] twoSum(int [] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i ++) {
            if (map.containsKey(target - nums[i])) return new int[]{map.get(target - nums[i]), i};
            map.put(nums[i], i);
        }
        return null;
    }
    public List<List<Integer>>  ThreeSum(int [] nums){
        Arrays.sort(nums);
        List< List<Integer>> res = new ArrayList<>();
        for(int i = 0; i < nums.length && nums[i] <= 0; i ++){
            if(i == 0 || nums[i-1] != nums[i]) twoSumhelper(nums, i , res);
        }
        return res;
    }

    private void twoSumhelper(int[] nums, int i, List<List<Integer>> res) {
    }

    public void twosumhelper(int []  nums, int i , List<List<Integer>> res){
        var seen = new HashSet<>();
        for(int j = i + 1; j < nums.length ; j ++){
            int complement = - nums[i] - nums[j];
            if(seen.contains(complement)){
                res.add(Arrays.asList(nums[i],nums[j],complement));
                while(j + i < nums.length && nums[j ] == nums[j ++]) j ++;
            }
            seen.add(nums[j]);
        }
    }
//    public List<List<Integer>>  foursum(int [] nums. int target){
//        Arrays.sort(nums);
//        return ksum(nums, target, 0,4);
//    }
//    public List<List<Integer>>  ksum(int [] nums, long target, int start, int k){
//        List<List<Integer>> res = new ArrayList<>();
//        if(start == nums.length) return res;
//
//        long avarage_values = target/k;
//        if(nums[start] > avarage_values || avarage_values > nums[nums.length -1 ]) return res;
//        if(k == 2) return tw
//    }
    public int lengthOfLongestSubString(String s){
        int res = 0;
        Map<Character, Integer> map = new HashMap<>();
         for(int i = 0, j = 0 ; i < s.length(); j ++){
             if(map.containsKey(s.charAt(i)))
                 i = Math.max(map.get(s.charAt(i)), i);
             res= Math.max(res, j -i + 1);
             map.put(s.charAt(j), j++);
         }
         return  res;
    }
}
