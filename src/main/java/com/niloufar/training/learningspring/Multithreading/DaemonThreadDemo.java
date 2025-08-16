package com.niloufar.training.learningspring.Multithreading;

class  KitchenCleaner extends Thread{
    public void run(){
        while (true){
            System.out.println("Niloufar cleaned the kitchen");
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("Niloufar finish cleaning and is leaving the Kitchen");
        }
    }
}
public class DaemonThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread niloufar = new KitchenCleaner();
        niloufar.setDaemon(true);
        niloufar.start();

        System.out.println("someone is cooking ....");
        Thread.sleep(500);
        System.out.println("someone is cooking ....");
        Thread.sleep(500);
        System.out.println("someone is cooking ....");
        Thread.sleep(500);
        System.out.println("someone is cooking ....");
        Thread.sleep(500);
    }
}