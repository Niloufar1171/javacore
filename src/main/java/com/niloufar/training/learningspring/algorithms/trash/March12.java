package com.niloufar.training.learningspring.algorithms.trash;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class March12 {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
        myLinkedList.add(5);
        myLinkedList.add(4);
        myLinkedList.add(4);
        myLinkedList.add(4);
        myLinkedList.add(5);
        myLinkedList.add(5);
        myLinkedList.add(1);

        myLinkedList.print();

        myLinkedList.remove(3);
        myLinkedList.print();

        System.out.println();
        myLinkedList.reverse();
        myLinkedList.print();

        System.out.println("Remove dublicates from sorted list");
        myLinkedList.removeDublicateSorted();
        myLinkedList.print();

        System.out.println("removing dublicates from unsorterd list");
        myLinkedList.removeDublicateUnsorted();
        myLinkedList.print();

    }
}

class MyLinkedList{
    Node head;
    public MyLinkedList (){
        head =null;
    }
    //add
    public void add (int data){
        Node newNode = new Node(data);
        Node curr = head;
        if( head == null ) head = newNode;
        else{
            while(curr.next != null ){
                curr = curr.next;
            }
            curr.next =newNode;
        }

    }
    //print
    public void print (){
        Node curr = head;
        while(curr != null){
            System.out.print(curr);
            curr = curr.next;
        }
        System.out.println();
    }

    //Remove
    public void remove (int data){
        Node curr = head;
        if(head == null) return;
        if(head.data == data) head = head.next;//deleting the head

        while(curr.next != null && curr.next.data == data){
          curr = curr.next;
        }
        if(curr.next !=null){
            curr.next = curr.next.next;//deleting the node
        }
    }
    //roveerse
    public void reverse (){
        Node curr = head;
        Node prev = null;
        if(head == null ) return;
        while(curr !=null) {
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
            }
        head = prev;
    }
    //remove dublicates from sorted
    public void removeDublicateSorted(){
        Node curr = head;
        while(curr.next != null && curr.next.next !=null){
            if(curr.data == curr.next.data)
                curr.next= curr.next.next;
            else{
                curr = curr.next;
            }
        }
    }
    public void removeDublicateUnsorted(){
        Set<Integer> seen = new HashSet<>();
        Node curr = head;
        Node prev = null;
        while( curr !=null  ){
            if(seen.contains(curr.data)){
                prev.next = curr.next;
            }else{
                seen.add(curr.data);
                prev = curr;
            }
            curr = curr.next;
        }
    }

    public void hasCycle(){
        if(head == null ) return;
        Node fast = head.next;
        Node slow = head;

        while(slow !=fast){
            if(fast == null || slow ==null ) {
                System.out.println("no cycle");
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println("there is a cycle");
    }
    public void createCycle(int data){
        if( head == null) return ;
        Node curr = head;
        Node newNode = null;

        while(curr !=null){
            if(curr.data == data){
               newNode = curr;
            }
            curr = curr.next;
        }


    }
}
class  Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
    }
    @Override
    public String toString(){
        return "Node" + this.data + "--->";
    }
}
