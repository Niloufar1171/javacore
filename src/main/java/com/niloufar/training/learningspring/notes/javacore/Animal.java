package com.niloufar.training.learningspring.notes.javacore;
//you can even not have any abstract class
//you can abstract without body or not abstract method
//you can have the same for attribute
//to make 
public abstract class Animal {
    //public abstract String sound; // ❌ Compilation error
   protected  String sound;// <---using protected
     public String name ;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "sound='" + sound + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public abstract String getSound();
    public abstract void setSound(String sound);
    public void speed(){
        System.out.println("regular speed is : " );
    }

}
