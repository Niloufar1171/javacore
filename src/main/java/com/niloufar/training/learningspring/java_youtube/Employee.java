package com.niloufar.training.learningspring.java_youtube;

import com.niloufar.training.learningspring.java_features.functional_interface.Address;

import java.util.Comparator;

public class Employee implements  Comparator<Employee> {
    private int id;
    private String name;
    public Address address;
    private int age;
    private float salary;


    public Employee(int id, int age, String name, float salary, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.age = age;
        this.salary = salary;
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

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "com.niloufar.training.learningspring.java_features.streamAPI.Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}'+ "\n";
    }

//    @Override
//    public int compareTo(com.niloufar.training.learningspring.java_features.streamAPI.Employee o) {
//        return 0;
//    }
//

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.id - o2.getId();
    }

}
