package com.niloufar.training.learningspring.algorithms.trash;

import java.util.ArrayList;
import java.util.List;

public class myQueue {
    private List<String> list ;
    private int front;

    public myQueue(){
        this.list = new ArrayList<>();
        this.front= -1;
    }

    public void enqueue(String element){
        list.add(element);

    }
    public String dequeue(){
         front ++;
         return  list.get(front);
    }


    @Override
    public String toString() {
        return "myQueue{" +
                "list=" + list +
                ", front=" + front +
                '}';
    }
}


