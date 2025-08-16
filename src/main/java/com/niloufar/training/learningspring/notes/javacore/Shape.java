package com.niloufar.training.learningspring.notes.javacore;

public interface Shape {
    public String publicName = null;
    public void Draw();

    String privateName = null;

// You will get error here!
//    public default void color(){
//        System.out.println("NO color");
//    }
   // protected String name ;

    default void color(){
        System.out.println("NO color");
    }
    default void shapePrinter(){
        System.out.println("Shape does not have any concirt line");
    }
}
