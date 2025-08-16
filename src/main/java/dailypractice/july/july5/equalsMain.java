package dailypractice.july.july5;

import dailypractice.july.july5.Employee;

public class equalsMain {
    public static void main(String[] args) {
        Employee e1 = new Employee(1,"Niloufar");
        Employee e2 = new Employee(2,"Niloufar");

        System.out.println("Those too object are : " +  e1.equals(e2) );
    }
}
