package com.niloufar.training.learningspring.notes.javacore.functionalInterface;

public class ClassNotFoundExceptionDemo {
//    public static void main(String [] args) throws ClassNotFoundException{
//        Class.forName("com.mysql.jdbc.Driver");//we are trying to load a driver that does not exists
//
//    }

    public static void main(String[] args) {

        try {//using reflection!
            Class.forName("com.mysql.jdbc.Driver");//we are trying to load a driver that does not exists
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
