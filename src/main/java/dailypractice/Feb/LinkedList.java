package dailypractice.Feb;

import com.niloufar.training.learningspring.algorithms.myLinkedList;
import org.springframework.http.server.DelegatingServerHttpResponse;

import javax.websocket.OnClose;
import java.util.ArrayList;
import java.util.List;

public class LinkedList {
    Node head;
    LinkedList (){ head = null;}
    //Add
    public void Add(int data){
        Node newNode = new Node(data);

        if (head == null)
            head = newNode;
        else {
            Node curr = head;
            while(curr.next != null){
                curr = curr.next;
            }
            curr.next = newNode;
        }
    }

    //delete
    public void delete(int data){
        Node curr =  head;
        Node prev = head;
        while(curr.next != null){
            if(curr.data == data)
             prev.next = curr.next;
            else
                prev = curr;
            curr = prev.next;
        }
    }
    //print
    public void print(Node head){
        Node curr = head;
        System.out.print("LinkedList: ");
        while (curr != null){
            System.out.print(" , date : "+ curr.data +"--->" );
            curr = curr.next;
        }
        System.out.println();
    }
    public void Reverse(Node head){
        Node curr = head;
        Node prev = null;
        while(curr != null ){
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
      this.head = prev;
    }

    public Node GetEndOfFirstHalf(){
        Node slow= this.head;
        Node fast = this.head;
        while (fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    //search
    //rotate
@Override
public String toString(){
        return "LinkedList :" + this.head;
}

}
