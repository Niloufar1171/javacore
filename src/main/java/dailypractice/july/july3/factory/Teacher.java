package dailypractice.july.july3.factory;

public class Teacher implements Profession{

    String name;
    Float Salary;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getSalary() {
        return Salary;
    }

    public void setSalary(Float salary) {
        Salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", Salary=" + Salary +
                '}';
    }

    @Override
    public void print(){
        System.out.println("My profession is Teacher:");
    }
}
