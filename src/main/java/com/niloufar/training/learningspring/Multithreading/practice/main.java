package com.niloufar.training.learningspring.Multithreading.practice;
//Create a thread
//
public class main {
    public static void main(String[] args) {
        MultithreadingDemo obj = new MultithreadingDemo();
        Thread t1 = new Thread(obj);
        t1.start();

    }
}
