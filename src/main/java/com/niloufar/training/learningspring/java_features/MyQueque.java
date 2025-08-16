package com.niloufar.training.learningspring.java_features;

import java.util.ArrayList;
import java.util.List;

public class MyQueque {
    // FIFO
    // put  --> at the end
    // peek --> the top
    // parameter size  p2 pointer showing top and the end  (end - top)
    //
    //
    //1 ,2, 3, 4, 5
    // 2 ,3 ,4, 5
    private final int size;
   // int front ; // we can have this removed if we do not want circular queue
    int rear;
    int [] list ;

    public MyQueque(int size) {
        this.list = new int[size];
       // this.front =0;
        this.rear = 0;//next available location where
        this.size = size;
    }
    public MyQueque() {
        this(100);
    }

    //Enqueue
    public void enqueue(int data){
        if(isFull()) {
            System.out.println("queue is full");
            return;
        }
        //
        list[rear] = data;
        rear ++;
    }
    

  public boolean isEmpty(){
        return  this.rear == 0;
  }
  public boolean isFull(){
        return this.size == this.rear;
  }




 }
