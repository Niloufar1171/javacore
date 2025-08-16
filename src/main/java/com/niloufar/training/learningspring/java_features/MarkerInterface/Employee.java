package com.niloufar.training.learningspring.java_features.MarkerInterface;

import java.io.Serializable;
//static and transient are not serializable!
public class Employee implements Serializable {
    private  int id;
    private transient int password;
    private String name;
//to remember the version of sersializtion

    @Override
    public String toString() {
        return "com.niloufar.training.learningspring.java_features.streamAPI.Employee{" +
                "id=" + id +
                ", password=" + password +
                ", name='" + name + '\'' +
                '}';
    }

    public Employee(int id, int password, String name) {
        this.id = id;
        this.password = password;
        this.name = name;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    private static final long serialVersionUID = 1L;
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
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
