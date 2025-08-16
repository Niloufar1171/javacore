package com.niloufar.training.learningspring.notes.javacore;

public class DemoAbstract {
    public static void main(String[] args ) {
       // Animal a = new Animal(); asking for implementation

        Animal a = new Dog();
        System.out.println(a.getSound());

    }
}
