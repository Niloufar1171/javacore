package com.niloufar.training.learningspring.java_features.functional_interface;

import java.util.Comparator;

public class StudentComparator { //implements Comparator<StudentCompara> I will use the lamda expresions and not implement it here like in Address
    String name;
    int grade;

    StudentComparator(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return name + " (" + grade + ")";
    }
}