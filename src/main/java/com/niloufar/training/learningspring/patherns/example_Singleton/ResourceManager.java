package com.niloufar.training.learningspring.patherns.example_Singleton;

public class ResourceManager {
    public static void main (String [] args){

     //   PrintSpooler spooler = new PrintSpooler(); instead of creating from new class!

        PrintSpooler spooler = PrintSpooler.getInstance();


        //using com.niloufar.training.learningspring.Singleton pattern in Multithreading we need to use syncrinized keyword to avoid t2 to get access the get instance method

        Thread t1 = new Thread(()->{PrintSpooler s = PrintSpooler.getInstance();});

        Thread t2 = new Thread(()->  { PrintSpooler s = PrintSpooler.getInstance();});

        t1.start();
        t2.start();
    }
}
