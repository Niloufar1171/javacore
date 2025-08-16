package dailypractice.july.july6;

import java.util.List;

public class Employee {
    int id;
    String name;
    float salary;
    List<String> EmployedCities;

    public Employee(int id, String name, float salary, List<String> employedCities) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.EmployedCities = employedCities;
    }

    public List<String> getEmployedCities() {
        return EmployedCities;
    }

    public void setEmployedCities(List<String> employedCities) {
        EmployedCities = employedCities;
    }

    @Override
    public String toString() {
        return "com.niloufar.training.learningspring.java_features.streamAPI.Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", EmployedCities=" + EmployedCities +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public Employee(int id, String name, float salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}
