package com.niloufar.training.learningspring.java_features.functional_interface;

public class StudentComparable implements Comparable<StudentComparable> {
    String name;
    int grade;

    StudentComparable(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    @Override
    public int compareTo(StudentComparable other) {
        return Integer.compare(this.grade, other.grade);
    }

    @Override
    public String toString() {
        return name + " (" + grade + ")";
    }
}
