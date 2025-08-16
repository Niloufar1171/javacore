package dailypractice.jan.jan30;

import java.util.*;

public class main {
    public static void main(String [] args){
        //find dublicate in a list

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(101, "B", 65000));
        employeeList.add(new Employee(102, "Hassan", 20000));
        employeeList.add((new Employee(99, "Sarah", 10100)));
        employeeList.add(new Employee(105, "Ai", 65000));
        employeeList.add(new Employee(104, "Ali", 65000));
        employeeList.add(new Employee(103, "Ali", 65000));
        employeeList.add(new Employee(103, "Sarah", 65000));

      //  System.out.println(employeeList);
        //find dublicated names and return the value in a list of com.niloufar.training.learningspring.java_features.streamAPI.Employee!

        Set<String> set = new HashSet<>();
        List<Employee> res = new ArrayList<>();
        for (Employee e : employeeList){
            if(!set.add(e.getName())){
                res.add(e);
            }
          //  set.add(e.getName());

        }
        System.out.println("The employees with a common name are : " + res);
// count of each name == 1
        // map.put(i, map.getOrDefault(i, 0) + 1);
        Map<String,Integer> map = new HashMap<>();
        for(Employee e : employeeList ){
                map.put(e.getName(),map.getOrDefault(e.getName(),0)+1 );  //map.put(name , value + 1 ) --> map.put(e.getName, map.getKey(e.getName) + 1 )
                if(map.get(e.getName())> 1){
                    System.out.println("We have more than one employee with the name :" + e.getName());
                }
        }
       // System.out.println(map);

//create a map and loop through it
        Map<String,List<Employee>> companyMap = new HashMap<>();
        companyMap.put("Developer", employeeList);
        companyMap.put("HR", employeeList);
        companyMap.put("Acountant", employeeList);
        companyMap.put("IT", employeeList);
      //  System.out.println(companyMap);


//        for(Map.Entry<String,List<com.niloufar.training.learningspring.java_features.streamAPI.Employee>> e : companyMap.entrySet()){
//            System.out.println("com.niloufar.training.learningspring.java_features.streamAPI.Employee Type :" + e.getKey() + "\n" + e.getValue()   );
//        }

        for(Map.Entry<String,List<Employee>> e : companyMap.entrySet()){
           for(Employee employees : e.getValue())
            if(employees.getName().equals("Sarah")){
                System.out.println("here is Sarah Info :" + "Department : " + e.getKey() +" "+ employees);
            }
        }




//        List<Person> personList = new ArrayList<>();
//
//        Set<Person> duplicates=personList.stream().filter(p -> Collections.frequency(personList, p) ==2)
//                .collect(Collectors.toSet());
    }
}
