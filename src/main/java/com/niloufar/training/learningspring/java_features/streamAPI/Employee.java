package com.niloufar.training.learningspring.java_features.streamAPI;

public class Employee {
    private int id;
    private String name;
    private Long salary;
    private String city ;
    private String dept;

    public Employee(int id, String name, Long salary, String city, String dept) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.city = city;
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "com.niloufar.training.learningspring.java_features.streamAPI.Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", city='" + city + '\'' +
                ", dept='" + dept + '\'' +
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

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
}
