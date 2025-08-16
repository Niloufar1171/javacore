package com.niloufar.training.learningspring.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.stream.Collectors;

/*
initiation at once
new String[] { "apple", "banana", "orange", "kiwi" };
 */
public class AllConversions {
    public static void main(String[] args) {
       CollectionToString();
    }
    String string = "myString";
    String [] strings = {"one", "two", "three"};

    int intnum = 10;
    int [] arrayint = {1,2,3,4};

    Integer Intnum = 1;
    Integer [] arrayInteger = {1,2,3,4};

    char c = 'a';
    char [] chars = {'a','b', 'c'};

    Character character = 'a';
    Character [] characters = {'a','b', 'c'};

    List<Integer> listInt = new ArrayList<>();
    List<String> stringList = new ArrayList<>();

    List<int []> ints = new ArrayList<>();
    List<Integer[]> Ints = new ArrayList<>();
    List<char[]>  charsList = new ArrayList<>();
    //List<int> ERROR
   // List<char> ERROR

    //-------------------------------------------------------------------------------------------------------------------
//string ---> int, Integer, int [], char []
    //-------------------------------------------------------------------------------------------------------------------

    public static void StringToEverything(){
        String str = "10,20,30";
        int mynum = Integer.parseInt(str);
        Integer myInteger = Integer.parseInt(str);
        Integer mynums = Integer.valueOf(str);
        //if we have or invalid numbers
        int[] numArray1 = Arrays.stream(str.split(","))
                .map(String::trim)
                .mapToInt(Integer::parseInt)
                .toArray();
        //if we have space
        int[] numArray2 = Arrays.stream(str.split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        //----------
        String[] strArray = str.split(","); // Split by comma
        int[] numArray = new int[strArray.length];

        for (int i = 0; i < strArray.length; i++) {
            numArray[i] = Integer.parseInt(strArray[i].trim()); // Convert each part to int
        }
        System.out.println(Arrays.toString(numArray)); // Output: [10, 20, 30]

    }

    //-------------------------------------------------------------------------------------------------------------------
//  ! int,char,boolean, int [], char []  ---->  String
    // List<Integer> --> can be done automatically no need to convert
    //-------------------------------------------------------------------------------------------------------------------
public static void EverythingToString(){
    int [] sample = {1,2,3};
    char[] characters = {'a','b','c'};
    int x = 10;
    int [] y = {1,2,3};
    //ValueOf takes all primitives types and only array of chars
     String result = String.valueOf(x);
     String result3 = String.valueOf(characters);
    // String result4 = String.valueOf(y);// String.valueOf(sample); implicit call
     String result4 = Arrays.toString(y);

     String result2 = Arrays.toString(sample);
     System.out.println(result2);

    String s = "hello";
    char[] characters1 = s.toCharArray();
    System.out.println(String.valueOf(characters1));
   int [] nums = {1,2,3,4};
    List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());  //<----------------BOXING
    }
    //-------------------------------------------------------------------------------------------------------------------

    //char to string
    //-------------------------------------------------------------------------------------------------------------------
    public static void CharactertoString(){

    }
    //-------------------------------------------------------------------------------------------------------------------
//string to char
    //-------------------------------------------------------------------------------------------------------------------
    //-------------------------------------------------------------------------------------------------------------------
//List<Integer> to others
    //-------------------------------------------------------------------------------------------------------------------
    public static void CollectionToString(){
        List<Integer> list = List.of(1,2,3,4);
        System.out.println(list);
    }


    //-------------------------------------------------------------------------------------------------------------------
//List<String> to others
    //-------------------------------------------------------------------------------------------------------------------
    // ------------------------------------------------------------------------------------------------------------------

    //    //-------------------------------------------------------------------------------------------------------------------
}
