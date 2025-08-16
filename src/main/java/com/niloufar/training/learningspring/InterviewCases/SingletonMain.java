package com.niloufar.training.learningspring.InterviewCases;

import com.niloufar.training.learningspring.InterviewCases.Singleton;

public class SingletonMain {
    public static void main(String[] args) {

        Singleton OriginalInstance = Singleton.getSingletonInstance();
        Singleton DublicateInstance = Singleton.getSingletonInstance();
        System.out.println("The Original instance : " + OriginalInstance.hashCode());
        System.out.println("The Dublicate Instance : " + DublicateInstance.hashCode());
    }
    //break with reflexion, cloning , serializing !
}
