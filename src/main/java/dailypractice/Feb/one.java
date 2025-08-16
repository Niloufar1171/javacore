package dailypractice.Feb;

import java.util.*;

public class one {

    public static void main (String [] args){

        class Employee{
            private int id;
            private String name;
            private int salary;


            public Employee(int id, String name, int salary) {
                this.id = id;
                this.name = name;
                this.salary = salary;
            }

            @Override
            public String toString() {
                return "employee{" +
                        "id=" + id +
                        ", name='" + name + '\'' +
                        ", salary=" + salary +
                        '}';
            }
        }


        List<Employee> list1 = new ArrayList<>();
        list1.add(new Employee(100,"A",34000));
        list1.add(new Employee(1,"A",34000));
        list1.add(new Employee(2,"B",70000));
        list1.add(new Employee(3,"B",70000));
        list1.add(new Employee(4,"B",70000));
        list1.add(new Employee(5,"B",70000));
        list1.add(new Employee(6,"B",70000));
        list1.add(new Employee(7,"B",70000));
        list1.add(new Employee(8,"B",70000));
        list1.add(new Employee(9,"B",70000));
        list1.add(new Employee(25,"B",70000));


        List<Employee> list2 = new ArrayList<>();
        list2.add(new Employee(1,"A",34000));
        list2.add(new Employee(3,"B",70000));

        for(Employee e : list1){
            System.out.println(e);
        }
        //find the common employee
        List<Employee> res = new ArrayList<>();
        HashMap<Integer, Employee> map = new HashMap<>();

        for(Employee e1 : list1){
            map.put(e1.id,e1);
            System.out.println(e1);
            }
        for(Employee e2 : list2){
           if(map.containsKey(e2.id)){
               res.add(e2);

            }
        }
        System.out.println("the common employee is : " + res);

        // sorting the employee base on id
        list1.stream().sorted(Comparator.comparingInt(i -> i.id)).forEach(i -> System.out.println(i));



    }

}
