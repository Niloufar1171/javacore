package com.niloufar.training.learningspring.java_features.streamAPI;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class streanDemo {
    public static void main(String[] args) {
        List<String> sentences = Arrays.asList("Hello Nilloufar", "GoodBye Niloufar");
        for (String sentence : sentences){
            System.out.println(sentence);
        }
        sentences.stream().flatMap(sentence-> Arrays.stream(sentence.split(" "))).collect(Collectors.toList()).forEach(System.out::println);

//****************************************************************************************************************************************
        System.out.println("*************************************************************************************************************");
        int [] array = {1,2,2,3,4,4,4,5,5,6};
        List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());
        List<Integer> newList = list.stream().distinct().collect(Collectors.toList());
        System.out.println("Remove dublicated only using distinct on Stream  " + newList);
//You can do it also with set
//        Set<Integer > set = new HashSet<>();
//        for(int i =0; i < list.size(); i ++){
//            if(!set.contains(list.get(i)))
//                set.add(list.get(i));
//        }
//        System.out.println(set);
    }
}
