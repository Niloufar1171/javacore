package com.niloufar.training.learningspring.notes.javacore;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashMapLoop {
    public static void main(String[] args) {

        HashMap<Integer, String> companies = new HashMap<>();
        companies.put(1, "RBC");
        companies.put(2, "CIBC");
        companies.put(3, "BMO");
        companies.put(4, "Scotia");


        System.out.println("Looping through keys Interface------------------------------------");
        for (Integer key : companies.keySet()) {
            System.out.println("Company's ID " + key + " Companies name :" + companies.get(key));
        }

        System.out.println("Looping using EntrySet object Interface------------------------------------");
        for (Map.Entry<Integer, String> e : companies.entrySet()) {
            System.out.println("Company's ID " + e.getKey() + " Companies name :" + e.getValue());
        }


        System.out.println("Looping through keys Iterator------------------------------------");
        Iterator<Integer> it = companies.keySet().iterator();
        while (it.hasNext()) {
            Integer key = it.next();
            System.out.println("Company's ID " + key + " Companies name :" + companies.get(key));

        }

        System.out.println("Looping creating set of entry object------------------------------------");
        Set<Map.Entry<Integer,String>> entries = companies.entrySet();
        for(Map.Entry<Integer,String>  e: entries ){
            System.out.println("Company's ID " + e.getKey() + " Companies name :" + e.getValue());
        }
    }
}

