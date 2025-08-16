package com.niloufar.training.learningspring.cracking_code_of_interviewing.chapterFifteen;

public class RuntimeExample implements Runnable {
    int count = 0;

    @Override
    public void run() {
        System.out.println(" Running threads starting ...");
        try {//wait 2 s then print
            while (count < 5) {
                Thread.sleep(3000);
                count++;
                System.out.println(count);
            }
        } catch (InterruptedException e) {
            System.out.println("Runnable thread Intrupted ");
        }
        System.out.println("Runnable Thread terminating ....");
    }

    //Clock
// ----, ----,   ---- ,-----,-----,-----, ------, ----, ----,   ---- ,-----,-----,-----, ------
//hello, hell0, hello,  0   ,hello, hell0, hello, 1    ,hello, hell0, hello, 2 ,hello, hell0, hello
    public static void main(String[] args) {
        RuntimeExample instance = new RuntimeExample();
        Thread myThread = new Thread(instance);
        System.out.println("Strating the thread....");
        myThread.start();
        while(instance.count !=5){
            try{
               Thread.sleep(1000);
                System.out.println("hello");
               } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
