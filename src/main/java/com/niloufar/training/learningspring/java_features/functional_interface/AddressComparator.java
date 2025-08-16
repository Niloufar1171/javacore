package com.niloufar.training.learningspring.java_features.functional_interface;

import java.util.Comparator;

public class AddressComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2){

        return o1.getAddress().compareTo(o2.getAddress());
    }
}
