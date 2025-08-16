package com.niloufar.training.learningspring.notes.javacore.objectMethods;

import java.util.*;
import java.util.stream.Collectors;

public class ObjectMethodsDemo {
    public static void main(String[] args) throws Exception {

      //Clone! is a shallow copy but if you uses getter and setter we can perform a deep copy cause a new object is going to be created
        MyObject obj1 = new MyObject("Test", 100);
        MyObject obj2 = (MyObject) obj1.clone();

        System.out.println("obj1.toString(): " + obj1);
        System.out.println("obj2.toString(): " + obj2);
        //change the original object1 and the hash code will be different  and equal method would be false ! because getter and setter create a new objects
        //obj1.setName("test2");
       // System.out.println(obj2.getName());
        //---------
        System.out.println("obj1.equals(obj2): " + obj1.equals(obj2));
        System.out.println("obj1.hashCode(): " + obj1.hashCode());
        System.out.println("obj2.hashCode(): " + obj2.hashCode());
//-------- We can not use clone() on collections cause the collections is an interface that does not implement or have any clone method!
// instead we have to declare the correct type or use constuction base copy by new key word
        ArrayList<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        ArrayList<String> copy = (ArrayList<String>) list.clone();  // OK

      //  Collection<String> coll = new ArrayList<>();
     //   Collection<String> copy = coll.clone();  // ❌ Compilation error!

        Collection<String> original = new ArrayList<>();
        Collection<String> copy2= new ArrayList<>(original);
        //Stream
        Collection<String> copy3 = original.stream().collect(Collectors.toList());

        HashMap<String, String > map = new HashMap<>();//Some implementations has the clone method as public NOT MAP but hashmap, hashset, Treeset...
        map.put("a","apple");
        map.clone();
// --------Overriding the hash code
        Set<MyObject> set = new HashSet<>();
       MyObject myObj3 = new MyObject("Niloufar",33);
        MyObject myObj4 = new MyObject("Niloufar",33);
        set.add(myObj3);
        set.add(myObj4);
        System.out.println("my set size is : " + set.size());// if we do not override the hasecode the size would be 2 ! you can comment the hashcode in Myobject and check here
//-----------------------------------------------------------------------------------------------------------------------
        // Test wait/notify using threads
        MyObject sharedObject = new MyObject("Shared", 1);

        Thread t1 = new Thread(() -> {
            try {
                sharedObject.waitAndNotifyExample();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }, "Thread-1");

        Thread t2 = new Thread(() -> {
            try {
                Thread.sleep(1000); // Wait a bit before notifying
                sharedObject.setValue(2);
                System.out.println(sharedObject);
                sharedObject.triggerNotify(); // or use triggerNotifyAll()
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }, "Thread-2");

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        // Suggest GC to demonstrate finalize (not guaranteed to run)
        obj1 = null;
        obj2 = null;
        System.gc(); // May call finalize(), but not guaranteed
    }
}
