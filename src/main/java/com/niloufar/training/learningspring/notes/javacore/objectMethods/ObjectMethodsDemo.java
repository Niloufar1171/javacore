package com.niloufar.training.learningspring.notes.javacore.objectMethods;

import java.util.*;
import java.util.stream.Collectors;
/*
 Clone :
 0-override a clone method in class instance(MyObject).
 1-Clone an object using cloneable interface (clone object, collections) LEARN THAT CLONE IS A SHALLOW COPY.
 2-Learn shallow and deep copy and how their hashcode changes by modifiying the values.
 3-Call clone on Collections! that overridden the clone Interface
 4-learn clone by casting or by using constructor.
 how to clone an object like employee

 Hashcode :
 0- Override hashcode method.
 1- Hashcode in Objects class and in collections like sets
 2- size of sets/Maps/Objects clases when hash code is overwritten.
 Equals:
 1-learn how to override the equsls method.
 2-call equal methods for the instance of an object


 */
public class ObjectMethodsDemo {

    public static void main(String[] args) throws Exception {

      //Clone! is a SHALLOW COPY but if you use getter and setter we can perform a deep copy cause a new object is going to be created
        MyObject obj1 = new MyObject("Bob", 100);
        MyObject obj2 = (MyObject) obj1.clone();

        System.out.println("obj1 :" + obj1 + "Original object hash code :" + obj1.hashCode());
        System.out.println("obj2 :" + obj2 + "clone of the original object hash code :" + obj2.hashCode()) ;
        System.out.println("************************************************************************************************************************************************************************");

        //Change the original object1 and the hash code will be different and equal method would be false ! because getter and setter create a new objects
        obj1.setName("Nilou");//--> the hash code of the object is going to change since we change it's properties
        System.out.println("Changing the name in Original object but the value of name on the clone is not going to change since clone is a shallow copy! " + obj2.getName());
        System.out.println("obj1.equals(obj2): " + obj1.equals(obj2));
        System.out.println("obj1.hashCode(): " + obj1.hashCode());
        System.out.println("obj2.hashCode(): " + obj2.hashCode());
        //-------- We CANNOT USE clone() on COLLECTIONS cause the collections is an interface that does not implement or have any clone method!
        // instead, we have to declare the correct type or use construction base copy by new key word( by casting or using constructor)
        ArrayList<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");

        //ArrayList<String > test = list.clone();//--> requires casting
        ArrayList<String> copy = (ArrayList<String>) list.clone();  //clone by using casting.
        ArrayList<String> copy2 = new ArrayList<>(list);//using a copy constructor!

        Collection<String> original = new ArrayList<>(); //
        Collection<String> copy3= new ArrayList<>(original);//--> clone by using constructor
        Collection<String> copy4 = original.stream().collect(Collectors.toList());  //using stream

        HashMap<String, String > OriginalMap = new HashMap<>();// Some implementations have the clone method as public NOT MAP but hashmap, hashset, Treeset...
        OriginalMap.put("a","apple");
        HashMap<String, String> ColoneMap = new HashMap<>(OriginalMap);// clone by interface
        HashMap<String, String> ColoneMap2 = (HashMap<String, String>) OriginalMap.clone();//clone by casting
        System.out.println("Original Map : "+ OriginalMap + "Original Hahcode is :" + OriginalMap.hashCode());
        System.out.println("Clone Map :" + ColoneMap + " Clone map hashcode is : " + ColoneMap.hashCode());
        //changing the properties in the original to show the hash code is going to change but not on the clone version meaning clone is soing only a shallow copy NOT deep without
        //directly changing the property of the code the clone object is going to still show the original value that ir copied to.
        System.out.println("After clone the map both hashcode are the same but if we change the value of the original map the cole is not going to show it and the hash code on originals going to be different, if we wantto have the changes when we clone we have to do DEEP copy meaning using geetter and setter ");
        OriginalMap.put("a","alo evera");
        System.out.println("Original Map : "+ OriginalMap + "Hashcode :" + OriginalMap.hashCode());
        System.out.println("Clone Map :" + ColoneMap + " Clone map " + ColoneMap.hashCode());

        System.out.println("************************************************************************************************************************************************************************");
        System.out.println("************************************************************************************************************************************************************************");
// --------Overriding the hash code
        Set<MyObject> set = new HashSet<>();
        MyObject myObj3 = new MyObject("Niloufar",33);// --> do not misunderstand name and value for  key value pairs! They are only object properties
        MyObject myObj4 = new MyObject("Niloufar",33);//--> the vaules are the same if we did not overridden the hash code method we would have two object here and size qould be 2!
        set.add(myObj3);
        set.add(myObj4);

        System.out.println("my set size is : " + set.size() + " because I override the hashcode");// if we do not override the hasecode the size would be 2 ! you can comment the hashcode in Myobject and check here
        System.out.println(set);

        set.add(new MyObject("bob"));
        set.add(new MyObject("bob"));// adding only bob not going to add anything in the set.
        set.add(new MyObject(5));
        //set.add(new MyObject(5));--> Error for cause of the equals method ?????
        System.out.println(set  + " size is : " + set.size());
//Example of normal hashset
        HashSet<Integer> UniqueNums = new HashSet<>();
        UniqueNums.add(1);
        UniqueNums.add(1);
        UniqueNums.add(2);
        System.out.println("UniqueNumbers is : " + UniqueNums);
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
