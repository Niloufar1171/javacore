package com.niloufar.training.learningspring.cracking_code_of_interviewing.chapterThree;



public class ListNode {

    Node root;
    public class Node{
        int data;
        Node next;
        public  Node(int data ){
            this.data = data;
        }
    }
    //add
    public Node add (int data ){
        if (root != null ) {
            Node newNode = new Node(data);
            Node curr = root;
            while (curr != null){
                curr = curr.next;
            }
            curr.next = newNode;
        }
        return root;
    }
    //remove data
    public Node remove(int data){
        Node curr = root;
        Node prev = root;
        while (curr != null){
            if(curr.data == data){
               prev = curr.next;  //2-->3 ---> 4 -->5 // delete 3 : 2-->4
            }
            prev = curr;
            curr = curr.next;
        }
        return prev;
    }
    //remove the index!

    //print
    public void print(Node root){
        Node curr = root;
        while (curr != null){
            System.out.println( curr.data + " ---> "  );
        }
    }
    //Reverse




}
