package com.niloufar.training.learningspring.Multithreading;
/*
Here we learn how important it is to use final in multithreading
Also if calling write and reader right away we might get null pointer exception cause we do not specify thread oder.
Because value is final, the JVM guarantees the reader sees 42, not a default or stale value.
 */

public class FinalDemo {
    static SafeObject shared;
    static UnsafeObject shared2;


    public static void main(String[] args) throws InterruptedException {

        Thread writer = new Thread(()->shared = new SafeObject());
        writer.start();
        writer.join();//wait until writer is done-->ensures the main thread waits until that’s done.

        Thread reader = new Thread(() -> {
            if (shared !=null) System.out.println(shared.value);// --> always print the static value --> need synchronization otherwise we get null pointer exceptions!
        });

        reader.start();

        //Example of calling right away --> we will get null pointer exceptions
     //   writer.start();
     //   reader.start();
//************************************************************************************************************************
        Thread writer2 = new Thread( () -> shared2 = new UnsafeObject());
        writer2.start();
        writer2.join();

        Thread reader2 = new Thread( () -> {
            if (shared2 != null) {
                System.out.println("The value of not final variable is : "+ shared2.value); // Could print 0 instead of 42!
            }
        });

        reader2.start();
    }
}

class SafeObject {
    final int value;

    SafeObject() {
        value = 42;
    }
}

class UnsafeObject {
    int value;

    UnsafeObject() {
        value = 42;
    }
}

