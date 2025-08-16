package com.niloufar.training.learningspring.notes.javacore.Referencing;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;


public class WeakhashmapDemo {
    public static void main(String[] args) {
        Map<Object, String> hashMap = new HashMap<>();//I am using object here to changed it , if you put string that is immutable you can not Update it after so PAY ATTENTION YOU
        //can not update a key in map becaue you change the hash code for while changing it. you better delete and create a new value!!!!!
        Map<Object, String> weakHashMap = new WeakHashMap<>();

        Object key1 = new Object();
        Object key2 = new Object();

        hashMap.put(key1, "HashMapValue");
        weakHashMap.put(key2, "WeakHashMapValue");

        key1 = null;
        key2 = null;

        System.gc(); // Suggest GC (not guaranteed)

        System.out.println("HashMap: " + hashMap);
        System.out.println("WeakHashMap: " + weakHashMap);


    }
}
