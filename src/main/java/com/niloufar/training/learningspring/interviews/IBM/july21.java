package com.niloufar.training.learningspring.interviews.IBM;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class july21 {
    public static void main(String[] args) {
        List<String> res = CommonSubString(new String[]{"ab","ee","ef"}, new String[]{"ab","cd","ef"});
        System.out.println(res);
    }


    public static List<String> CommonSubString (String [] str1 , String [] str2){

        List<String> res = new ArrayList<>();

       for(int i = 0 ; i < str1.length; i++){
           int checker = 0;
           for(int j = 0; j < str1[i].length(); j++){
             // if(str2[i].indexOf( str1[i].charAt(j) ) >= 0)
               if(str1[i].charAt(j) == str2[i].charAt(j))
                  checker ++;
           }
           if(checker > 0) res.add("YES");
           else res.add("NO");

       }

        return res;
    }

    public static long carParkingRoof(List<Long> cars, int k) {
        // Write your code here
        if (cars.size() == 0 || k < 0) {
            return 0;
        }

        Collections.sort(cars);
        long minDist = Long.MAX_VALUE;

        for (int i = 0; i <= cars.size() - k; i++) {
            minDist = Math.min(minDist, cars.get(i + k - 1) - cars.get(i));
        }

        return minDist + 1;
    }
    //sliding windows options
    public static int minRoofLength(int[] arr, int k){
        Arrays.sort(arr);
        int start = 0;
        int minRoofLength = Integer.MAX_VALUE;
        for(int end=0;end<arr.length;end++){
            if(end < k-1) continue;
            int currentRoofLength = arr[end]-arr[start++]+1;
            minRoofLength = Math.min(minRoofLength, currentRoofLength);
        }
        return minRoofLength;
    }
}
