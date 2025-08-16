package com.niloufar.training.learningspring.algorithms.trash;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

public class MainQ {
    public static void main(String [] args){
    myQueue q = new myQueue();

    q.enqueue("Niloufar");
    q.enqueue("Adam");
    q.enqueue("Senjuti");
        System.out.println(q);


        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
    }
}
