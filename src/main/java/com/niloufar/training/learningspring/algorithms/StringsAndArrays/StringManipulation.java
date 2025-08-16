package com.niloufar.training.learningspring.algorithms.StringsAndArrays;

import java.util.*;
import java.util.Arrays;
import java.util.stream.Collectors;

public  class StringManipulation {

     public static void longestCommonPrefix(String [] strs) {
        if (strs.length == 0) System.out.println("");
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++)

            while (strs[i].indexOf(prefix) != 0) {
                int indexof = strs[i].indexOf(prefix);
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) System.out.println("");
            }
        System.out.println(prefix);

    }

    //**********************************************************************************************************************
    public static void sortArrayByParity () {
            int[] nums = {1, 3, 0, 5};
            int evenIndex = 0, oddIndex = nums.length - 1;

            while (evenIndex < oddIndex) {
                if (nums[evenIndex] % 2 > nums[oddIndex] % 2) {
                    int tmp = nums[evenIndex];
                    nums[evenIndex] = nums[oddIndex];
                    nums[oddIndex] = tmp;
                }

                if (nums[evenIndex] % 2 == 0) evenIndex++;
                if (nums[oddIndex] % 2 == 1) oddIndex--;
            }
            System.out.println(Arrays.toString(nums));
        }

}