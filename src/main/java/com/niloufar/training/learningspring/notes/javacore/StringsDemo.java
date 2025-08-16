package com.niloufar.training.learningspring.notes.javacore;

public class StringsDemo {
    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = "hello";

        String str3= new String("hello");

        System.out.println(" String with new key word hashcode is :" + str1.hashCode());
        System.out.println(" String with no new  word hashcode is :" + str2.hashCode());//have the same hashcode!
        System.out.println(" String with new key word hashcode is :" + str3.hashCode());
        System.out.println(str1.equals(str2));// str 1 and2 and 3 all have the same hashcode !


        str2 = "modified";
        System.out.println(" String with no new  word hashcode is :" + str2.hashCode());//now it ha different hashcode!
        System.out.println(str1.equals(str2));
        System.out.println(str1 == str2);
//--------------------------------------------
        str2 = "hello";//changing the value the hashcode would be still the same but the reference to it wouldbe differeent so == is false !
        System.out.println(" String with no new  word hashcode is :" + str2.hashCode());//now it ha different hashcode!
        System.out.println(str1.equals(str2));
        System.out.println(str1 == str2);
    }
}
