package com.niloufar.training.learningspring;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ToBreakSingleton {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Singleton OriginalInstance = Singleton.getSingletonInstance();
        Singleton DublicateInstance = Singleton.getSingletonInstance();
        System.out.println("This is a hash code of the original : " + OriginalInstance.hashCode());
        System.out.println("this is the hash code of the dublicates : " + DublicateInstance.hashCode());

        //Reflextion
        Class<?> singletonClass = Class.forName("main.java.com.niloufar.training.learningspring.Singleton");
        Constructor<Singleton> constructor =(Constructor<Singleton>) singletonClass.getDeclaredConstructor();
        constructor.setAccessible(true);

        Singleton brokenSingletonUsingReflection = constructor.newInstance();
        System.out.println("This is a hash code of the original : " + OriginalInstance.hashCode());
        System.out.println("this is the hash code of the brokenSingletonUsingReflection : " + brokenSingletonUsingReflection.hashCode());


    }
}
