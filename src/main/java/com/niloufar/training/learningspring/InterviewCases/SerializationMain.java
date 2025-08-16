package com.niloufar.training.learningspring.InterviewCases;



import com.niloufar.training.learningspring.notes.javacore.functionalInterface.Employee;

import java.io.*;

public class SerializationMain {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Employee employee = new Employee(1,"hello");
        Employee employee2 = new Employee(1,"niloufar");
// crate a file -->create an object output stream...
        FileOutputStream fileOut = new FileOutputStream("/Users/niloufarbehrouzy/PROJECTS/employee.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOut);
        objectOutputStream.writeObject(employee);
        objectOutputStream.close();
        fileOut.close();

//----------------------------------------------------------------------
        FileInputStream fileInputStream = new FileInputStream("/Users/niloufarbehrouzy/PROJECTS/employee.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Employee reCreated = (Employee) objectInputStream.readObject();
        System.out.println(reCreated.getName());
        objectInputStream.close();
        fileInputStream.close();
    }
}
