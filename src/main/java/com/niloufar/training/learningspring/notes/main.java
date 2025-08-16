package com.niloufar.training.learningspring.notes;

import com.niloufar.training.learningspring.notes.javacore.Address;
import com.niloufar.training.learningspring.notes.javacore.Circle;
import com.niloufar.training.learningspring.notes.javacore.Employee;
import com.niloufar.training.learningspring.notes.javacore.Shape;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        //--------------------------------
        Employee e1 = new Employee("Niloufar",30, 100500F, new Address("Wellington", 13424));
        System.out.println(e1);
        //------------------------------
     //   Scanner scanner = new Scanner(System.in);
//        System.out.println("please Enter your name ");
//        String name = scanner.next();
//        System.out.println("Your name is :" + name);
        //------------------------------
//        int x = 10;
//        int [] arr = {1,2,3};
//        Add(x);
//        System.out.println("Send by value : " + x);
//        addArray(arr);
//        System.out.println("Send by reference " + arr[0]);
//        List<Integer> arrayList = new ArrayList<Integer>();
//        arrayList.add(1);
//        arrayList.add(2);
//        arrayList.add(3);
     //   System.out.println(arrayList.get(0));
      //-------------------
      List<String>  words = new ArrayList<>();
      words.add("first name");
      String [] strwords = new String[5];
      strwords[0] = "hello";

      //----String object and is equal and ==
        String s1 = new String("hello");
        String s2 = "hello";
        System.out.println(s1);
        System.out.println(s1 ==s2);
        System.out.println(s1.equals(s2));

        }
    public static void Add(int x){ x = x + 10;}
    public static int [] addArray (int[] arr ){
        for (int x : arr)
            x = x + 10;
        return arr;

    }
    public static  void AddList(List<Integer> arrayList){
        for(Integer x : arrayList) {
            x = arrayList.get(x) + 10;
            System.out.println(x);
        }
    }

}
