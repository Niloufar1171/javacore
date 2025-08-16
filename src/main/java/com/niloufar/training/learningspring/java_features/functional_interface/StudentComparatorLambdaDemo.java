package com.niloufar.training.learningspring.java_features.functional_interface;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StudentComparatorLambdaDemo {
    public static void main(String[] args) {
        List<StudentComparator> students = List.of(
                new StudentComparator("Alice", 90),
                new StudentComparator("Bob", 85),
                new StudentComparator("Carol", 95)
        );

        List<StudentComparator> sortedByName = new ArrayList<>(students);

        // Sort by name using Comparator (lambda)
        sortedByName.sort((s1, s2) -> s1.name.compareTo(s2.name));

        System.out.println("Sorted by name:");
        sortedByName.forEach(System.out::println);

        // Sort by grade (descending)
        List<StudentComparator> sortedByGrade = new ArrayList<>(students);
        sortedByGrade.sort(Comparator.comparingInt(s -> -s.grade));

        System.out.println("\nSorted by grade descending:");
        sortedByGrade.forEach(System.out::println);

    }

}
