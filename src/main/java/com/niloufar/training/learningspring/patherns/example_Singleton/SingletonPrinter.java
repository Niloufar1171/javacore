package com.niloufar.training.learningspring.patherns.example_Singleton;

public class SingletonPrinter {
    private static SingletonPrinter singletonInstance = null;
    private SingletonPrinter(){};

    public static SingletonPrinter getInstance(){
        if (singletonInstance == null)
            singletonInstance = new SingletonPrinter();
        return singletonInstance;
    }

}
