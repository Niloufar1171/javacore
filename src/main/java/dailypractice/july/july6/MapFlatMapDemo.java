package dailypractice.july.july6;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapFlatMapDemo {
    public static void main(String[] args) {
        List<String> strlist = new ArrayList<>();
        strlist.add("Tehran");
        strlist.add("Montreal");
        strlist.add("Calgery");
        strlist.add("Seatle");


        List<Employee> employeeList = new ArrayList<>();
        employeeList.add( new Employee(1,"niloufar", 30000, List.of("Tehran", "Montreal")));
        employeeList.add(  new Employee(2,"Ali", 40000, List.of("Tehran", "Montreal", "Toronto")));
        employeeList.add(  new Employee(3,"John", 550000, List.of("Tehran", "Montreal", "Paris")));
        employeeList.add(   new Employee(4,"Hassan", 650000, List.of("Tehran", "Montreal", "London", "Beijing")));
        employeeList.add(  new Employee(5,"Tom", 70000, List.of("Tehran", "Montreal", "Vancouver", "Calgery", "Seatle")));
        employeeList.add(  new Employee(6,"Alex", 80000, List.of("Tehran", "Montreal")));

        for (Employee e : employeeList){
            System.out.println(e);
        }
      List<Integer> Ids = employeeList.stream().map(employee -> employee.getId()).collect(Collectors.toList());
        System.out.println(Ids);
//bring all the unique cities from all the employees// I can use only sort() because I am flat mapping it- seeing it as a list of regular collection
        System.out.println("------------------------------------------------------------");
        Set<String>  uniqueCities  =  employeeList.stream().flatMap(employee ->employee.getEmployedCities().stream()).collect(Collectors.toSet());
        System.out.println(uniqueCities);

        System.out.println("------------------------------------------------------------");
        Set<String>  uniqueCitiesSorted  =  employeeList.stream().flatMap(employee ->employee.getEmployedCities().stream()).sorted().collect(Collectors.toCollection(LinkedHashSet::new));
        System.out.println("Unique cities from all the employees :" + uniqueCitiesSorted);

        System.out.println("------------------------------------------------------------");
        List<String> sortingStringList = strlist.stream().sorted().collect(Collectors.toList());
        System.out.println(" Asc Order Unique cities from all the employees : " + sortingStringList);

        System.out.println("------------------------------------------------------------");
        Set<String>  uniqueCitiesDscSorted  =  employeeList.stream().flatMap(employee ->employee.getEmployedCities().stream()).sorted(Comparator.reverseOrder()).collect(Collectors.toCollection(LinkedHashSet::new));
        System.out.println("Reversed order Unique cities from all the employees : " + uniqueCitiesDscSorted);

    }
}
