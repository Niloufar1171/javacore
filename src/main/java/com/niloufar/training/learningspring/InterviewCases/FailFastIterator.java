package com.niloufar.training.learningspring.InterviewCases;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FailFastIterator {
    public static void main(String[] args) {
        Map<String, String > map = new HashMap<>();
        map.put("a", "apple");
        map.put("b", "banana");

        Iterator it = map.keySet().iterator();

        while(it.hasNext()){
            System.out.println(it.next());
            map.put("s", "strawberries");// Concurrent modification error//Exception in thread "main" java.util.ConcurrentModificationException
        }
    }
}
