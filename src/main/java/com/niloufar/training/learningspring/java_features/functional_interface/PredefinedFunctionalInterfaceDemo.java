package com.niloufar.training.learningspring.java_features.functional_interface;

import java.util.Date;
import java.util.function.*;

public class PredefinedFunctionalInterfaceDemo {
    public static void main(String[] args) {
        //functional Interface- get a arg and returen boolean  body of the already declared test function!
        //one input and a boolean output
        Predicate<String> checklen = s -> s.length()>=5;
        System.out.println("PREDICATE the length of the string is greater that 5 :" + checklen.test("niloufar"));
        System.out.println("***********************************************************************");
//?????
        Comparable<String> myCompareStructure =  str->str.compareTo("Niloufar");
        System.out.println(myCompareStructure.toString());

        Predicate<String> checkEvenlength = s -> s.length()%2 == 0;
        System.out.println("PREDICATE the length of the string is greater that 5 :" + checkEvenlength.test("niloufar"));
        System.out.println("***********************************************************************");

        //Chaining
        System.out.println("CHAINING PREDIATES "+ checklen.and(checkEvenlength).test("niloufar"));
        System.out.println("***********************************************************************");

        //One input and one output
        Function<Integer,Integer> squareMe = i -> i*i;
        System.out.println("FUNCTION what is the squarer of 3? "+ squareMe.apply(3));
        System.out.println("***********************************************************************");

        //Get a one input and return nothing
        Consumer<String> printMe = s -> System.out.println("CONSUMER Emplyee name is : " + s);
        printMe.accept("Niloufar");
        System.out.println("***********************************************************************");

        //Supplier nothing  but return something
        Supplier<Date> currentData = ()-> new Date();
        System.out.println("SUPPLIER My current date from supplier is : " + currentData.get());


        Supplier<Double> randomNumber = ()-> Math.random();
        System.out.println("SUPPLIER provide a random number for me : " + randomNumber.get());
        System.out.println("***********************************************************************");
    //Bi
        BiPredicate<String, String> checkEqualString = (s1,s2)-> s1.equals(s2) ;//s1.compareTo(s2) == 0
        System.out.println("BI PREDICATE checking to see if those two string is equal : "+checkEqualString.test("ab","abc"));
        BiPredicate<Integer, Integer> checkComplement = (a,b)-> a+b == 0 ;//s1.compareTo(s2) == 0
        System.out.println("BI PREDICATE Check if two numbers are compleemnt to eachother :" +  checkComplement.test(-1,1));
        System.out.println("***********************************************************************");


    }
}
