package com.niloufar.training.learningspring.java_features.functional_interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MainComparatorDemo {

    public static void main(String [] args){
        Employee e1= new Employee(1,20,"Tom", 60000, new Address("Street1", 111));
        Employee e2= new Employee(2,19,"Hassan",65000, new Address("Street23", 222));
        Employee e3= new Employee(3,18,"Ali", 30000, new Address("Street34", 333));
        Employee e4= new Employee(4,17,"Mary", 40000, new Address("Street45", 444));
        Employee e5= new Employee(1,20,"Tom", 87000, new Address("Street1", 555));

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

        Collections.sort(mylist ,new AgeComparator());
        System.out.println("Sorted based on Age : " + mylist);
        System.out.println("*************************************************************************");

        Collections.sort(mylist,new NameComparator());
        System.out.println("Sorted based on name : " + mylist);
        System.out.println("*************************************************************************");

        Collections.sort(mylist , new AddressComparator());//we did inside it implement the natural sorting
        System.out.println("Sorted based on Address : " + mylist);
        System.out.println("*************************************************************************");

    //Practice with streams and Lambda expressions! In here we do Impliment on spot insteas of in seperate classes!
        // I am using COMPARATOR  here implicitly call compare method that takes 2 args and return int for bigger or smaller

        List<Employee> streamlist = mylist.stream().sorted((o1,o2)-> o2.getId() - o1.getId()).collect(Collectors.toList());
        System.out.println("Sorted based on streams id in lambda : " + streamlist);
        System.out.println("*************************************************************************");

        List<Employee> streamSortedSalary = mylist.stream().sorted((s1,s2)-> (int) (s1.getSalary() - s2.getSalary())).collect(Collectors.toList());
        System.out.println("Sorted com.niloufar.training.learningspring.java_features.streamAPI.Employee list with Lamda Expressions and using Comparator ! ");
        System.out.println(streamSortedSalary);
        System.out.println("*************************************************************************");

        List<Employee> streamSalary = mylist.stream().sorted( (o1 , o2) -> (int) (o2.getSalary()- o1.getSalary())).limit(3).collect(Collectors.toList());
        System.out.println("the highest 3 salaries are :" + streamSalary);


        List<Employee> streamSalary2 = mylist.stream().sorted( (o1,o2)-> (int) (o2.getSalary()- o1.getSalary())).skip(3).collect(Collectors.toList());
        System.out.println("All salaries after 3 highest ones are :" + streamSalary2);
       //???? List<com.niloufar.training.learningspring.java_features.streamAPI.Employee> streamSalary3 = mylist.stream().sorted((o1, o2) -> o1.compare(o2)).collect(Collectors.toList());
    }

}
