package dailypractice.july.july7;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class StreamQuestions {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1,"nilufar", 87000));
        employeeList.add(new Employee(2,"Sarah", 30000));
        employeeList.add(new Employee(3,"John", 35000));
        employeeList.add(new Employee(4,"Tom", 40000));
        employeeList.add(new Employee(5,"Alex", 55000));

        employeeList.stream().sorted((o1, o2) -> (int) (o2.getSalary()- o1.getSalary())).collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("--------Top 3 salaries----------------");
        employeeList.stream().sorted((o1, o2) -> (int) (o2.getSalary()- o1.getSalary())).limit(3).collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("--------All less than top 3 salaries----------------");
        employeeList.stream().sorted((o1, o2) -> (int) (o2.getSalary()- o1.getSalary())).skip(3).collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("-------------------");
        employeeList.stream().filter(employee -> employee.getId() %2 == 0).map(e->{
            e.printName();
            return e.getName();} ).forEach(x-> System.out.println(" com.niloufar.training.learningspring.java_features.streamAPI.Employee name "));

    }
}
