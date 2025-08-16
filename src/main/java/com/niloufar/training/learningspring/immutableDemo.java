package com.niloufar.training.learningspring;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class immutableDemo {
    public static void main(String[] args) {

        List<String> hobbies = new ArrayList<>();
        hobbies.add("dancing");
        hobbies.add("walking");

        Immutable  immutable = new Immutable("Ali", 2, hobbies);
        System.out.println( immutable.getHobbies());

        immutable.getHobbies().add("reading");
        System.out.println(immutable.getHobbies());
    }
}
