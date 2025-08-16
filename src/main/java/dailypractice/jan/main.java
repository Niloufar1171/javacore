package dailypractice.jan;

import java.util.*;
import java.util.stream.Collectors;

public class main {

    public static void main(String[] args) {

        List<Employee> employeeslist = new ArrayList<>();
        Employee e = new Employee(100, "Niloufar", 63000);
        employeeslist.add(e);
        employeeslist.add(new Employee(101, "Ali", 65000));
        employeeslist.add(new Employee(102, "Hassan", 20000));
        employeeslist.add((new Employee(99, "Sarah", 10100)));

        System.out.println(employeeslist);
        System.out.println("***************************************************************************************");
        System.out.println("Sorting based on com.niloufar.training.learningspring.java_features.streamAPI.Employee's Id : ");
        employeeslist.stream().sorted(Comparator.comparingInt(i -> i.getId())).forEach(i -> System.out.println(i));
        System.out.println("***************************************************************************************");
        System.out.println("sorting based on employee's name : ");
        employeeslist.stream().sorted(Comparator.comparing(i -> i.getName())).forEach(i -> System.out.println(i));

        Map<Company, List<Employee>> map = new HashMap<>();
        System.out.println("***************************************************************************************");
        System.out.println("Sorting based on com.niloufar.training.learningspring.java_features.streamAPI.Employee's Id : ");
        map.put(new Company("Morgan Stanley"), employeeslist);
        map.put(new Company("Nuance"), employeeslist);
        map.put(new Company("CIBC"), employeeslist);
        map.put(new Company("RBC"), employeeslist);
        System.out.println(map);
        System.out.println("***************************************************************************************");

        System.out.println("**TRY TO REMOVE COLLECTOR TO SEE THE  CUNCURRENT MODIFICATION ERROR *************************************************************************************");
        System.out.println("Show highest Salary paid Employees");
        List<Employee> highSalaryEmployee = new ArrayList<>();
        employeeslist.stream().filter(emp -> emp.getSalary() > 50000).collect(Collectors.toList()).forEach(em-> highSalaryEmployee.add(em));

                //.forEach(emp -> employeeslist.add(emp));
       // System.out.println(highSalaryEmployee);
        ;

        ///Practice using comapartor
        employeeslist.stream().sorted(Comparator.comparingInt(i->i.getId())).forEach(i-> System.out.println(i));

    }

    //getting all the employees where salaries are biiger than 50000
    public static void findEmployee(List<Employee> list) {
        List<Employee> res = new ArrayList<>();

        for (Employee e : list) {
            if (e.getSalary() > 50000)
                res.add(e);
        }
    }
}