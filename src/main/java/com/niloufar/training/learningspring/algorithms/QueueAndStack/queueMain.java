package com.niloufar.training.learningspring.algorithms.QueueAndStack;

import com.niloufar.training.learningspring.algorithms.QueueAndStack.myQueue;

public class queueMain {
    public static void main(String[] args) {
        myQueue q = new myQueue();
        q.enQueue(5);
        q.enQueue(3);
        if (!q.isEmpty()) {
            System.out.println(q.Front());
        }
        q.deQueue();
        if (!q.isEmpty()) {
            System.out.println(q.Front());
        }
        q.deQueue();
        if (!q.isEmpty()) {
            System.out.println(q.Front());
        }
    }
}
