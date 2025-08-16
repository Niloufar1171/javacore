package com.niloufar.training.learningspring.interviews;

import java.util.Arrays;

public class interview_strburst {

    public static void main(String[] args) {
        String inputData = "fibonacci 5\n" +
                "overlap 8,8 10,19 7,7 10,19\n" +
                "overlap -1,0 10,12 1,8 9,15\n" +
                "fibonacci 42\n" +
                "overlap -1,0 50,60 -5,-3 55,59\n" +
                "fibonacci 0\n" +
                "overlap 89,94 54,59 0,0 77,89 -1,9\n" +
                "overlap -1,-1 11,19 -11,-5 19,20\n" +
                "fibonacci -1\n" +
                "stats";

        String[] lines = inputData.split("[\r\n]+");
        System.out.println(lines[0]);
        int fibonacci_number = Integer.parseInt(lines[0].replaceAll("\\D+", ""));
        System.out.println(fibonacci_number);

        int[][] numbers = Arrays.stream("881019771019".split("(?<=\\G.{2})"))
                         .map(s -> (Arrays.stream(s.split("(?<=\\G.{1})"))
                        .mapToInt(Integer::parseInt).toArray())).toArray(int[][]::new);


        System.out.println(Arrays.deepToString(numbers));

     //
        int n1 = 0, n2 = 1, n3 = 0, i, count = 0;
        System.out.print(n1 + " " + n2);
        for (i = 2;  n3 < 34; ++i)
        {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }
}
