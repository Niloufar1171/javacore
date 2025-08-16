package com.niloufar.training.learningspring.java_features.MarkerInterface;

import java.io.*;

public class SerializationMain {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Employee employee = new Employee(1,"EmployeeName");
        // Create a file -->create an object output stream...
        FileOutputStream fileOut = new FileOutputStream("/Users/niloufarbehrouzy/PROJECTS/serialized/employee.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOut);
        objectOutputStream.writeObject(employee);
        objectOutputStream.close();
        fileOut.close();

       //----------------------------------------------------------------------
        FileInputStream fileInputStream = new FileInputStream("/Users/niloufarbehrouzy/PROJECTS/serialized/employee.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Employee reCreated = (Employee) objectInputStream.readObject();
        System.out.println(reCreated);
        objectInputStream.close();
        fileInputStream.close();

        //------Using TRansient variables ----------------------------------------------------------------
        Employee employee2 = new Employee(1,123456,"niloufar");
        FileOutputStream fileOut2 = new FileOutputStream("/Users/niloufarbehrouzy/PROJECTS/serialized/employee.ser");
        ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(fileOut2);
        objectOutputStream2.writeObject(employee2);
        objectOutputStream2.close();
        fileOut2.close();
        //----------------------------------------------------------------------
        FileInputStream fileInputStream2 = new FileInputStream("/Users/niloufarbehrouzy/PROJECTS/serialized/employee.ser");
        ObjectInputStream objectInputStream2 = new ObjectInputStream(fileInputStream2);
        Employee reCreated2 = (Employee) objectInputStream2.readObject();
        System.out.println(reCreated2);
        objectInputStream2.close();
        fileInputStream2.close();

    }
}
