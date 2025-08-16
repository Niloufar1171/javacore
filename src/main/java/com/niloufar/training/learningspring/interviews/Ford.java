package com.niloufar.training.learningspring.interviews;

import java.util.ArrayList;
import java.util.List;

public class Ford {


    public static void main (String [] arg){
        List<String> words = new ArrayList<>();
        words.add("abc");
        words.add("def");

        for (int i = 0; i < words.size(); i++){

            for (int j = 1 ; j <words.get(i).length()-1 ; j++ ){
                if ( words.get(i).charAt(j) == words.get(i).charAt(j--) ) {
                    while(words.get(i).charAt(j) + 1 == words.get(i).charAt(j++) ){
                            System.out.print(words.get(i).charAt(j));
                    }
            }

            }
    }

    }
}
