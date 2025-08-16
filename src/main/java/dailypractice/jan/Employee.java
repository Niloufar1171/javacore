package dailypractice.jan;

public class Employee implements Comparable<Employee> {
    private int id;
    private String name;
    private int salary;


    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Employee() {
    }



    public int getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }
    public int getSalary(){
        return  this.salary;
}
    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }

    @Override
    public String toString(){
        return "id : " + this.id + " name : " + this.name + " salary : " + this.salary;
    }


    @Override
    public int compareTo(Employee e) {
        return this.id - e.id;//-->
    }
}
