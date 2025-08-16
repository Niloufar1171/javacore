package com.niloufar.training.learningspring.algorithms;

public class linkedListMain {
    public static void main(String []args){

        myLinkedList list1 = new myLinkedList();
        list1.add(100);
        list1.add(200);
        list1.add(300);
        list1.add(400);
        list1.add(500);
        list1.add(600);


        myLinkedList list2 = new myLinkedList();
        list2.add(250);
        list2.add(500);
        list2.add(600);
        list2.add(600);

      list1.removeNthFromEnd(4);
      list1.print();


    }
}
