package com.niloufar.training.learningspring.Multithreading;

class chefKitchen extends Thread{
    public  int vegetable_count = 0;
    public static boolean chopping = true;
    public void run(){
        System.out.println("cutting vegtables...");
        try{
           // while (chopping){
               vegetable_count ++;
         //   }
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Niloufar is done cutting carrots");
    }
}

public class ThreadLifecycleDemo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("golbarg asking Niloufar to start....");
        chefKitchen nilou = new chefKitchen();
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("1-Niloufar's state is : " + nilou.getState());
        nilou.start();
        System.out.println("2-Niloufar's state is : " + nilou.getState());


        System.out.println("----------------------------------------------------------------------------");
        Thread.sleep(500);
        System.out.println("3-Niloufar's state is : " + nilou.getState());

       // System.out.println("----------------------------------------------------------------------------");
       // chefKitchen.chopping= false;
       // System.out.println("niloufar cuts :" + nilou.vegetable_count);


       System.out.println("----------------------------------------------------------------------------");
       nilou.join();
       System.out.println("4-Niloufar's state is : " + nilou.getState());
    }
}