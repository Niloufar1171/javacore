package com.niloufar.training.learningspring.notes.javacore;

public interface Shape {
    public String publicName = null;
    public void Draw();

    String privateName = null;

// You will get error here! cause you cannot have a public method with a body!
//default meethod are fully implemented but we should not have a public access modifier for them!
//    public default void color(){
//        System.out.println("NO color");
//    }
   // protected String name ; --> violate the contract of publicly available for interfaces!

    default void color(){
        System.out.println("NO color");
    }
    default void shapePrinter(){
        System.out.println("Shape does not have any concirt line");
    }
}
