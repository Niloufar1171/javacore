package com.niloufar.training.learningspring.notes.javacore;
// we can either access to the attribute of the abstract class by using a getter and setter or defined a protected access for attribute
public class Dog extends Animal{
    private String sound;

    public Dog() {
        this.sound = "Woof";
    }

    @Override
    public String getSound() {
        return sound;
    }

    @Override
    public void setSound(String sound) {
        this.sound = sound;
    }
}
