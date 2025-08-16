package com.niloufar.training.learningspring.algorithms;

import java.util.*;

public class primitives {

    //Definitions ---------------------------------------------------------------------------------

    //primitives
    int x = 2;
    int [] y = {1,2,3,4};
    float fl = 3.5F;
    byte b = 100;
    boolean bo = true;
    char [] c = new char['a'];

    //outboxing
    Integer x1 = 3;
    Float fl1 = 3.5F;
    Character c1 = 'a';

    // List
    List <String> list1= new ArrayList();
    List <String> list2 = new LinkedList();
    List <String> list3 = new Vector();
    List <String> list4 = new Stack();

    ArrayList<String> arrlist1 = new ArrayList<String>();// cwe can ignore explicits arg String
    LinkedList<String> linkedlist = new LinkedList<String>();
    Vector<String> vec = new Vector<String>();
    Stack<Character> stack = new Stack<Character>();
//-------------------------------------------------------------------------------------------
}
