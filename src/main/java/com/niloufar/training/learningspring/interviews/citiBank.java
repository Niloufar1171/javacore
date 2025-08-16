package com.niloufar.training.learningspring.interviews;

import java.util.Scanner;

public class citiBank {


    public static void main(String[] arg) {

        //get an string from output

        Scanner s = new Scanner(System.in);
        String str = s.next();

        StringBuilder sb = new StringBuilder();

        for (int j = str.length() - 1; j > 0; j--) {
            sb = sb.append(str.charAt(j));
        }

        System.out.println("The revers of the String "+ str+ "is : " + sb);

        //*************************************************


        String text = " Niloufar is a good girl";

        //check if Niloufar is there === a sub string!

    }
}
