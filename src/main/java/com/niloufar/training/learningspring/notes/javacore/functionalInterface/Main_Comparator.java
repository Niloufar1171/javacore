package com.niloufar.training.learningspring.notes.javacore.functionalInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main_Comparator {

    public static void main(String [] args){
        Employee e1= new Employee(1,"Tom", 18, 60000, new Address("Street1", 111));
        Employee e2= new Employee(2,"Hassan",19,65000, new Address("Street23", 222));
        Employee e3= new Employee(3,"Ali",30, 30000, new Address("Street34", 333));
        Employee e4= new Employee(4,"Mary",45, 40000, new Address("Street45", 444));
        Employee e5= new Employee(1,"Tom",45, 87000, new Address("Street1", 555));

        List<Employee> mylist = new ArrayList<>();
        mylist.add(e1);
        mylist.add(e2);
        mylist.add(e3);
        mylist.add(e4);
        mylist.add(e5);
        System.out.println("UnSorted List: "+ mylist);
        System.out.println("*************************************************************************");

        //Order  if we implement the comparable for the mylist we could use natural sorting but now we
        //have to use comaparator which is our customize version
        //we can open a stream and call it too

        Collections.sort(mylist,new AgeComparator());
        System.out.println("Sorted based on Age : " + mylist);
        System.out.println("*************************************************************************");

        Collections.sort(mylist,new NameComparator());
        System.out.println("Sorted based on name : " + mylist);
        System.out.println("*************************************************************************");

        Collections.sort(mylist,new AddressComparator());//we did inside it implement the natural sorting
        System.out.println("Sorted based on name : " + mylist);
        System.out.println("*************************************************************************");

    //Practice with streams-
        // I am using COMPARATOR  here implicitly call compare method that takes 2 args and return int for bigger or smaller

        List<Employee> streamlist = mylist.stream().sorted((o1, o2)-> (int) o2.getId() - o1.getId()).collect(Collectors.toList());
        System.out.println("Sorted based on streams id: " + streamlist);
        System.out.println("*************************************************************************");

        List<Employee> streamSalary = mylist.stream().sorted( (o1, o2)-> (int) (o2.getSalary()- o1.getSalary())).limit(3).collect(Collectors.toList());
        System.out.println("the hiest 3 salaries are :" + streamSalary);


        List<Employee> streamSalary2 = mylist.stream().sorted( (o1, o2)-> (int) (o2.getSalary()- o1.getSalary())).skip(3).collect(Collectors.toList());
        System.out.println("All salaries after 3 highest ones are :" + streamSalary2);
       //???? List<com.niloufar.training.learningspring.java_features.streamAPI.Employee> streamSalary3 = mylist.stream().sorted((o1, o2) -> o1.compare(o2)).collect(Collectors.toList());
    }

}
