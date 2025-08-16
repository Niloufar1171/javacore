package com.niloufar.training.learningspring.Multithreading.practice;

import ch.qos.logback.core.net.SyslogOutputStream;

public class ExecutionSchedulingDemo  {
    public static void main(String[] args) throws InterruptedException {
        VegtableChopper Niloufar = new VegtableChopper("Niloufar");
        VegtableChopper Golbarg = new VegtableChopper("Golbarg");

        Niloufar.start();
        Golbarg.start();

        Thread.sleep(5000);
        VegtableChopper.chopping = false;

        Niloufar.join();
        Golbarg.join();

        System.out.format(" Niloufar chopped %d vegetables.\n" , Niloufar.vegtable_count);


    }

}
class VegtableChopper extends Thread{

    public int vegtable_count = 0;

    public static boolean chopping = true;

    public VegtableChopper (String name){this.setName(name);}

    public void run(){
        System.out.println(this.getName() + " chopped vegtable");
        vegtable_count ++;
    }
}
