package dailypractice.jan;

import java.util.ArrayList;
import java.util.List;


public class mainComparator {
    public static void main (String [] args){
        List<Employee> employeeslist = new ArrayList<>();
        Employee e = new Employee(100, "Niloufar", 63000);
        employeeslist.add(e);
        employeeslist.add(new Employee(101, "Ali", 65000));
        employeeslist.add(new Employee(102, "Hassan", 20000));
        employeeslist.add((new Employee(103, "Sarah", 10100)));
        employeeslist.add((new Employee(104, "Sarah", 10100)));
        employeeslist.add((new Employee(200, "Sarah", 10100)));
        employeeslist.add((new Employee(210, "Sarah", 10100)));
        employeeslist.add((new Employee(99, "Sarah", 10100)));



        System.out.println(employeeslist);
        System.out.println("***************************************************************************************");

        int [] arr = {1,2,3};



    }
}
