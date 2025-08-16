package com.niloufar.training.learningspring.java_features.streamAPI;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeDemo {
/*
      1- print all  the names in the list of strings
      2- print all the names in the list of string s that starts with a specificc characters
      3- print all the numbers in the list of numbers both integer or int
      4- print all the numbers that are > than something, Even, Odd
      5- Find Max or minimum int the list
      6- sort the list, reverse
      6- find the max top 5 numbers
      7- find the max top 5 salaries in Employee and put in in collection
      8- find the max top 5 based on salary and print them

    find the fifth highest paid emplyees on each dept and city
 */
//    group by

    // get department based of highest of salaries
/*
stream().
        forEach()
        filter()
        max()
        sorted()
        sorted(Comparator.reverseOrder())
        distinct()
        Peek()
        limit()


 */
public static void main(String[] args) {
    List<Employee> employeeList = new ArrayList<>();
    employeeList.add(new Employee(1, "Sevin", 10000L, "NY", "IT"));
    employeeList.add(new Employee(2, "Maira", 20000L, "NY", "IT"));
    employeeList.add(new Employee(3, "niloufar", 30000L, "NY", "IT"));
    employeeList.add(new Employee(4, "Nina", 40000L, "NY", "EX"));
    employeeList.add(new Employee(5, "natalia", 100000L, "NY", "EX"));
    employeeList.add(new Employee(6, "Maria", 50000L, "NY", "AB"));
    List<String> dept_original = new ArrayList<>();
    //   dept_original= employeeList.stream().sorted(Comparator.comparingLong(Employee:getSalary() ).reverse().findFrist()).Collectors.toList();
    //  List<String> originalList = Arrays.asList("Apple", "Banana", "Orange");
    // List<String> dept_copy = originalList.stream();
    System.out.println("**********************************************************************************************************************");

    List<String> names = List.of("Sevin", "Maira", "Niloufar", "Nina", "natalia","Maria","Maya");
    List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9,120, 10, 50, 20, 30, 40, 100);

    names.stream().forEach(System.out::print);
    names.stream().forEach(s -> System.out.print(","+ s));
    names.stream().filter(name -> name.startsWith("N")).forEach(System.out::println);
    names.stream().filter(name->name.startsWith("M")).forEach(s -> System.out.println(s + "," ));

    List<Integer> evenNumbers = numbers.stream().filter(number -> number % 2 == 0).collect(Collectors.toList());//saving it somewhere
    numbers.stream().filter(num->num> 5).forEach(s-> System.out.print( s + ","));//printing it
    evenNumbers.stream().forEach(System.out::print);// Print one by one
    System.out.println(evenNumbers);// [2, 4, 6, 8, 10]

    System.out.println("*********************************************************************************");
    int maxNumber = numbers.stream().max(Integer::compare).orElseThrow();
    System.out.println(maxNumber);

    //int maxNumber<---- gives an error !!!!!
    Optional<Employee> maxSalary = employeeList.stream().max(Comparator.comparingLong(Employee::getSalary));
    System.out.println("max Salary is :" + maxSalary);

    List<Employee> top5 = employeeList.stream().sorted(Comparator.comparingLong(Employee::getSalary).reversed()).limit(5).collect(Collectors.toList());
    System.out.println(top5);// not a pretty to print

    employeeList.stream().sorted(Comparator.comparingLong(Employee::getSalary).reversed()).limit(5).forEach(employee -> System.out.println(employee.getName() + ", " + employee.getSalary()));

    System.out.println("******* Sort a list from high to low**************************************************************************");
    List<Integer> sorted_high_to_low = numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    System.out.println(sorted_high_to_low);

    System.out.println("******* Sort a list from low to high **************************************************************************");
    List<Integer> sorted_low_to_high = numbers.stream().sorted().collect(Collectors.toList());
    System.out.println(sorted_low_to_high);
 }
}
