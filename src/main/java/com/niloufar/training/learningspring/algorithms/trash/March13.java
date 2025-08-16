package com.niloufar.training.learningspring.algorithms.trash;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class March13 {
    static Map<Integer, Integer> memo = new HashMap<>();
    public static void main(String[] args) {
        // 1 2 3 5 8 13
        // n = 15
        // 1 ==> 1 = 1
        // 2 ==> 2 = 2
        // 3 ==>  (1) + (2) = 3q
        // 4 ==> (2) + (3)  = 5
      Fib(0,1,100);
    }
      public static void Fib(int prev, int prevprev, int  max) {
        if ( prev > max ) return;
          System.out.print(prev + ", ");

          Fib(prevprev, prevprev + prev, max);

     }
}