package com.niloufar.training.learningspring.algorithms;

import com.niloufar.training.learningspring.cracking_code_of_interviewing.chapterThree.ListNode;

import java.util.*;

public class myLinkedList {

    Node head;
    int size;

    myLinkedList(){
        head = null;
    }

    public static class Node{
        int data;
        Node next;

    public Node (int data){
        this.data = data;
        this.next = null;
    }
        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data+
                    ", next=" + next +
                    '}';/**/
        }
    }

    public  void add(int data){
        Node newNode = new Node(data);
        if(head == null)
            head = newNode;
        else{
            Node curr = head;
            while(curr.next != null)
                curr = curr.next;
            curr.next = newNode;//NOT IN THE LOOP
        }
    }
    //-----------------------------------------------------------------------------------------
    public void remove1( int data){
        Node curr = head;
        Node prev = head;
        //head needs to be deleted
        if(curr !=null && curr.data == data){
            this.head = curr.next;
            System.out.println(data + " is found and deleted!");
        }
        while (curr != null && curr.data != data){
            prev = curr;
            curr = curr.next;
        }
        if(curr !=null){
            prev.next = curr.next;//jumping on pointer to delete the node
            System.out.println(data + " is found and deleted!");
        }
       if(curr == null){
           System.out.println(data  + " not found");
       }
    }
    //-------------------------------------------------------------------------------------------------------------------------------------------
    public void remove2( int val) {
        Node prev = head;
        Node curr = head;

        if (curr != null && curr.data == val){// data is in  the head
            this.head = curr.next;// put null in  the haea
        }
        while (curr != null) {
            if (curr.data == val) {
                prev.next = curr.next; //delete the node
                System.out.println(val + " is found and deleted!");
            }
            else
                prev = curr; //increase the prev

            curr = curr.next; //increase the pointer
        }

    }
    //-------------------------------------------------------------------------------------------------------------------------------------------

    //remove
    public void remove3(int data){
        if(head == null) return;
        if(head.data == data) head = head.next;// putting null for the head!

        Node curr = head;
        // come out of loop when curr.next.next == data! and list is not at the end!
        //make sure I am not at the end of the list + make sure data is not what I am looking for
        //when I come out I check if I am at the end of the list and if not that means I found the data!
        while(curr.next != null && curr.next.data !=data ){
            curr = curr.next;
        }
        if(curr.next != null ) curr.next = curr.next.next;
    }

    public Node reverse(){
        Node prev= null;
        Node curr = head;
        while(curr !=null){
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;//this is a new head
    }
    //-------------------------------------------------------------------------------------------------------------------------------------------

    public Node reverse(Node head){
        Node prev= null;// if you put prev = head you will get null pointer exceptions
        Node curr = head;
        while(curr !=null){
            Node nexttemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nexttemp;
        }
        return prev;//this is a new head or you can put this.head = prev and return the same list
    }
    //-------------------------------------------------------------------------------------------------------------------------------------------
    public void Rotate(){
        Node curr = head;
        Node prev = head;
        while(curr.next != null){
            prev = curr;
            curr = curr.next;
        }
        prev.next = null;
        curr.next = head;
        head = curr;
    }
    //---rotate a linked list k times to the right ----------------------------------------------------------------------------------------------------------------------------------------

    public static Node rotateRight(Node head, int k) {
        if (head == null || head.next == null || k == 0) return head;

        // 1. compute length and reach tail
        Node tail = head;
        int len = 1;               // at least 1 node
        while (tail.next != null) {
            tail = tail.next;
            len++;
        }

        // 2. normalize k
        k %= len;
        if (k == 0) return head;

        // 3. make it circular
        tail.next = head;

        // 4. find new tail: (len - k - 1) steps from head
        int steps = len - k - 1;
        Node newTail = head;
        for (int i = 0; i < steps; i++) newTail = newTail.next;

        // 5. detach and return new head
        Node newHead = newTail.next;
        newTail.next = null;
        return newHead;
    }


    //-------------------------------------------------------------------------------------------------------------------------------------------
//sorted list
    public Node deleteDuplicates() {
        Node current = head;
        while (current != null && current.next != null) {
            if (current.next.data == current.data ){
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }
    //-------------------------------------------------------------------------------------------------------------------------------------------
   public void RemovedublicateUnsorted(){
        Node curr = head;
        Node prev = null;
        Set<Integer> seen = new HashSet<>();
        if(head == null ) return;
        while(curr != null){
            if(seen.contains(curr.data)){
                //delete
                prev.next = curr.next;
            }
            else{
                seen.add(curr.data);
                prev = curr;
            }
            curr = curr.next;
        }
   }
    //-------------------------------------------------------------------------------------------------------------------------------------------

    public void findMedium(){}
    //-------------------------------------------------------------------------------------------------------------------------------------------

    public void RemoveEven() {
        Node curr = head;
        Node temp = head;
        Node prev = head;
        while(curr != null){
            if(curr.data %2 == 0)
            {
                temp = curr;
                prev.next = curr.next;
            }
            prev = curr;
            curr = curr.next;
        }

    }
    public void oddEvenList() {
//first one is always odd and the next one is even
        Node odd = head;
        Node even = head.next;
        Node evenHead = even;

        while (even != null && even.next != null) {
            odd.next = even.next; //delete the even node like prev.next = curr.next
            odd = odd.next;//increase the odd pointer

            even.next = odd.next; //after increasing odd pointer now it is pointing to the next even so we have to add it to the even list
            even = even.next;
        }
        odd.next = evenHead;

    }
    Node frontPointer;
    public boolean isPalidrome(){
        Node frontPointer = head;
        return recursivelychack(head);

    }
    public boolean recursivelychack(Node curr){
        if(curr != null){
            if(!recursivelychack(curr.next)) return false;
            if(curr.data != frontPointer.data) return false;
            frontPointer = frontPointer.next;
        }
        return true;
    }
    public boolean isPalindromInplace(){
        if(head == null ) return true;
        Node firstHalfEnd = GetEndOfFirstHalf(head);
        Node secondHalfStart = reverse(head);
        Node p1 = head;
        Node p2 = secondHalfStart;

        boolean result = true;
        while(result &&  p2!=null){
            if(p1.data != p2.data ) return  false;
            p1= p1.next;
            p2= p2.next;
        }

        firstHalfEnd.next = reverse(secondHalfStart);
        return result;
    }

    public static boolean isPalindrome_UsingArray(Node head) {
        List<Integer> values = new ArrayList<>();
        Node curr = head;

        while(curr != null){
            values.add(curr.data);
            curr= curr.next;
        }
        int front =0;
        int back = values.size() -1;

        while(front < back){
            if(! values.get(front).equals(values.get(back))){
                return false;
            }
            front ++;
            back --;
        }

        return true;
    }
    //-------------------------------------------------------------------------------------------------------------------------------------------

    public Node GetEndOfFirstHalf(Node head){
        Node slow= head;
        Node fast = head;
        while (fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    //-------------------------------------------------------------------------------------------------------------------------------------------

    public  boolean hasCycle(){

        if (head == null) {
            return false;
        }
        Node slow = head;
        Node fast = head.next;

        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }

        return true;
    }
    public void removeNthFromEnd(int n){
        Node dummy = new Node(0);
        dummy.next = head;
        Node first = dummy;
        Node second = dummy;
        // Advances first pointer so that the gap between first and second is n nodes apart
        for (int i = 1; i <= n + 1; i++) {
            first = first.next;
        }
        // Move first to the end, maintaining the gap
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;

    }
    public myLinkedList Plus (myLinkedList list2){
        //list1 + list 2  as a number
        return  list2;
    }
    public void partition(int val){

    }
    public static Node mergeTwoLists( Node l1, Node l2) {
        Node dummy = new Node(-1);
        Node prev = dummy;

        while (l1 != null && l2 != null) {
            if (l1.data <= l2.data) {
                prev.next = l1;
                l1 = l1.next;
            } else {
                prev.next = l2;
                l2 = l2.next;
            }
            prev = prev.next;
        }
        //add the rest of the list
        prev.next =( l1 == null) ? l2 : l1;

        return dummy.next;
    }
    public static Node intersection(Node head1, Node head2){
        Set<Node > seen = new HashSet<>();

        Node a = head1;
        Node b = head2;
        while (a != null){
            seen.add(a);
            a = a.next;
        }
        while(b !=null){
            if(seen.contains(b)) return b;
            b = b.next;
        }
        return  null;

    }
    public static void print(Node head){
        Node curr = head;
        System.out.print("LinkedList: ");
        while (curr!= null){
            System.out.print(curr.data + "----> ");
            curr = curr.next;
        }

    }
    public void print(){
        Node curr = head;
        System.out.print("LinkedList: ");
        while (curr!= null){
            System.out.print(curr.data + "----> ");
            curr = curr.next;
        }

    }


    //    public ListNode insertionSortList(ListNode head) {
//
//        ListNode dummy = new ListNode();
//        ListNode prev = dummy;
//        ListNode curr = head;
//        ListNode next ;
//
//        while(curr !=null){
//            next = curr.next;
//
//            while ( prev.next !=null && prev.next.val <= curr.val)
//                prev = prev.next;
//
//
//            curr.next = prev.next;
//            prev.next = curr;
//
//            prev = dummy ;
//            curr = next;
//
//        }
//        return dummy.next;
//
//    }
    @Override
    public String toString(){
        return "data: " + this.head.data ;
    }
}

