package com.niloufar.training.learningspring.java_features.functional_interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentComparableDemo {
    public static void main(String[] args) {
        List<StudentComparable> students = List.of(
                new StudentComparable("Alice", 90),
                new StudentComparable("Bob", 85),
                new StudentComparable("Carol", 95)
        );

        List<StudentComparable> sorted = new ArrayList<>(students);
        Collections.sort(sorted); // uses compareTo()

        sorted.forEach(System.out::println);
    }
}
