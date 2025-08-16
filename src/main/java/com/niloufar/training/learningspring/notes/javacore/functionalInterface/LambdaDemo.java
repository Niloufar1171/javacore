package com.niloufar.training.learningspring.notes.javacore.functionalInterface;

import java.util.Comparator;
import java.util.function.BiConsumer;

public class LambdaDemo {
    public static void main(String[] args) {
       // LambdaDemo demo = new LambdaDemo();
      //  demo.add(10,5);

        BiConsumer<Integer, Integer> biConsumer = (a,b)-> System.out.println(a+b);
        biConsumer.accept(10,5);
//
//functional interfac          //lambda expression
        Comparator<String> c = (s1,s2)->s1.compareTo(s2);

        CustomFuctionInterface cfi = a-> System.out.println(a);
        cfi.test(10);

        //CustomFuctionInterface cfi2 = test::te
    }

    public static void testReferenceMothod(){
        System.out.println("this is the test implementation of abstract method");
    }
 //   public void add(Integer a, Integer b){
     //   System.out.println(a + b);
  //  }
}
