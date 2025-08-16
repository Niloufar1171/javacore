package com.niloufar.training.learningspring.notes.javacore.functionalInterface;

import java.io.Serializable;

//static and transient are not serializable!
public class Employee implements Serializable {
    private  int id;
    private String name;
    int age;
    int salary;
    Address address;
//to remember the version of sersializtion

    private static final long serialVersionUID = 1L;

    public Employee(int id, String name, int age, int salary, Address address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.address = address;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public Address getAddress() {
        return address;
    }

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "com.niloufar.training.learningspring.java_features.streamAPI.Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
