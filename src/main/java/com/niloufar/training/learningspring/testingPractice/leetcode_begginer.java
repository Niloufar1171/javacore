package com.niloufar.training.learningspring.testingPractice;

public class leetcode_begginer {

    public int[] twoSum(int[] nums, int target) {

        // only sume of two element

        //  if target-a[i] exits in the list

        int [] result = new int[2];
        for (int i=0;i<nums.length-1;i++){
            for (int j=i+1;j<nums.length-1;j++){
                if (target- nums[i]== nums[j]){
                    result[0] = i ;
                    result[1] = j;
                    break;
                }
            }
        }
        System.out.println(result[1]);
      //  System.out.println(result[1]);
        return result;

    }
}
