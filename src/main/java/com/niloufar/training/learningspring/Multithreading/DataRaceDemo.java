package com.niloufar.training.learningspring.Multithreading;
import java.util.concurrent.locks.*;

class Shopper extends Thread{

    static int garlicCounter = 0;
    static Lock pencil = new ReentrantLock();
    public void run(){

        for (int i = 0; i < 50; i ++){
            pencil.lock();
            garlicCounter ++;
            pencil.unlock();
            System.out.println(Thread.currentThread().getName() + " number of garlic : " + garlicCounter );
            try {
                Thread.sleep(500);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }


    }
}
public class DataRaceDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread niloufar = new Shopper();
        Thread golbarg = new Shopper();

        niloufar.start();
        golbarg.start();

        niloufar.join();
        golbarg.join();
        System.out.println("we should buy : " + Shopper.garlicCounter + " garlics.");
    }
}

