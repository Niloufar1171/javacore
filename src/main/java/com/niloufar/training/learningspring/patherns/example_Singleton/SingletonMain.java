package com.niloufar.training.learningspring.patherns.example_Singleton;

public class SingletonMain {
    public static void main(String[] args) {

        Singleton OriginalInstance = Singleton.getSingletonInstance();
        Singleton DublicateInstance = Singleton.getSingletonInstance();
        System.out.println("The Original instance hashcode : " + OriginalInstance.hashCode());
        System.out.println("The Dublicate Instance hashcode: " + DublicateInstance.hashCode());
    }
    //break with reflexion, cloning , serializing !
}
