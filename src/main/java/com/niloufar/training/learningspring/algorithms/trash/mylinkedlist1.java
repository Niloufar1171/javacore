//package com.niloufar.training.learningspring.algorithms.trash;
//
//import com.niloufar.training.learningspring.algorithms.myLinkedList;
//
//public class mylinkedlist1 {
//
//  Node head;
//
//    class Node {
//        int data ;
//        Node next;
//        public Node (int data){
//            this.data = data;
//            this.next = null;
//        }
//        @Override
//        public String toString() {
//            return "Node{" +
//                    "data=" + data+
//                    ", next=" + next +
//                    '}';
//        }
//    }
//
//    public mylinkedlist1(){
//        head = null;
//    }
//    //add
//    public void add(int data){
//        Node newNode = new Node(data);
//
//        if(head == null){
//            head = newNode;
//        }else{
//            Node curr = head;
//            while (curr.next != null){
//                curr = curr.next;
//            }
//            curr.next = newNode;
//        }
//
//    }
//
//    //delete
//    public void delete(int data){
//        Node curr = head;
//        Node prev = head;
////head needs to be deleted
//        if(curr !=null && curr.data == data) {
//            this.head = curr.next;
//            System.out.println(data + " is found and deleted!");
//        }
//            while (curr != null) {
//                if (curr.data == data) {
//                    System.out.println("Node found and deleted " + curr.data);
//                    prev.next = curr.next;
//                }
//                prev = curr;
//                curr = curr.next;
//            }
//
//    }
//    //find
//    public void find(int data){
//        Node curr = head;
//        int counter = 0;
//        while(curr != null){
//           if( curr.data == data)
//               counter++;
//            curr= curr.next;
//        }
//        System.out.println("Number of times data found in the list is : " + counter);
//
//    }
//    //revese
//    public Node  reverse(){
//        Node prev = null;
//        Node curr = head;
//
//        while(curr != null){
//            Node nextTemp = curr.next;
//            curr.next = prev;
//
//            prev = curr;
//            curr = nextTemp;
//        }
//        return prev;
//    }
//    //print
//    public void print(){
//        Node curr = head;
//        while (curr != null){
//            System.out.println(curr.data + "----> ");
//            curr= curr.next;
//        }
//    }
//   // toString
//    @Override
//    public String toString(){
//        return " " + this.head.data;
//    }
//}
//
