package com.niloufar.training.learningspring.algorithms.DynamicProgramming;

public class Basics {
    public static void maxProfit(int[] prices) {
        int maxprofit = 0;
        for (int i = 1; i < prices.length ; i++){
            if (prices[i] > prices[i-1] ) { // cal only if it is positive
                maxprofit += prices[i] - prices[i - 1];
            }
        }
        System.out.println(maxprofit);
    }
}
