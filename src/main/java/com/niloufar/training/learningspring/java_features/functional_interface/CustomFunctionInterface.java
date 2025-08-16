package com.niloufar.training.learningspring.java_features.functional_interface;

@FunctionalInterface
public interface CustomFunctionInterface {
    int add(int a , int b);//<---  NO body
    static int multiply(int a , int b){
        return a*b;
    }
}
