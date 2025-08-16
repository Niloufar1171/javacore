package com.niloufar.training.learningspring.java_features.functional_interface;

import java.util.Comparator;

public class NameComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getName().compareTo(o2.getName());
    }//name is a string and we have to call the compareTo on it.
}
