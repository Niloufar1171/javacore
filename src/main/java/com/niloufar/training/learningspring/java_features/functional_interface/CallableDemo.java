package com.niloufar.training.learningspring.java_features.functional_interface;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
public class CallableDemo {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        // Using a lambda to implement Callable
        Callable<String> task = () -> {
            Thread.sleep(1000); // simulate work
            return "Hello from Callable!";
        };

        // Submit the Callable task
        Future<String> future = executor.submit(task);

        // Wait and retrieve the result
        String result = future.get();
        System.out.println("Result: " + result);

        executor.shutdown();


    }
}
