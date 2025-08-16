package dailypractice.Feb;

import java.security.PublicKey;

public class Node {
    int data;
    Node next;
    public Node (int data ){
        this.data = data;
    }

    public Node() {
    }
    @Override
    public String toString(){
       return  "data : " + this.data ;

    }
}
