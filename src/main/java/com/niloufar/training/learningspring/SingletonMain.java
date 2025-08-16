package com.niloufar.training.learningspring;

import com.niloufar.training.learningspring.patherns.example_Singleton.Singleton;

public class SingletonMain {
    public static void main(String[] args) {

        com.niloufar.training.learningspring.patherns.example_Singleton.Singleton OriginalInstance = com.niloufar.training.learningspring.patherns.example_Singleton.Singleton.getSingletonInstance();
        com.niloufar.training.learningspring.patherns.example_Singleton.Singleton DublicateInstance = Singleton.getSingletonInstance();
        System.out.println("The Original instance hashcode : " + OriginalInstance.hashCode());
        System.out.println("The Dublicate Instance hashcode: " + DublicateInstance.hashCode());
    }
    //break with reflexion, cloning , serializing !
}
