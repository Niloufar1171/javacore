package com.niloufar.training.learningspring.java_features.MarkerInterface;

import java.io.*;
//we only write the id but not the name- if you open the file the name is not there,
public class ExternizationMain {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person person = new Person(1,"hello");
// crate a file -->create an object output stream...
        FileOutputStream fileOut = new FileOutputStream("/Users/niloufarbehrouzy/PROJECTS/person.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOut);
        objectOutputStream.writeObject(person);
        objectOutputStream.close();
        fileOut.close();

//----------------------------------------------------------------------
        FileInputStream fileInputStream = new FileInputStream("/Users/niloufarbehrouzy/PROJECTS/person.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Person reCreated = (Person) objectInputStream.readObject();
        System.out.println(reCreated.getId());
        objectInputStream.close();
        fileInputStream.close();
    }
}
