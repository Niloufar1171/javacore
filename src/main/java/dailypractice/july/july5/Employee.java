package dailypractice.july.july5;

import java.util.Objects;

public class Employee {
    int id;
    String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;// if they are pointing at the same object

        //check if the object is null or check if the object is not from employee class!(check the type)
        if (o == null || getClass() != o.getClass()) return false;

        //check the custome comparing
        Employee employee = (Employee) o;
        return id == employee.id && Objects.equals(name, employee.name);
    }
//    @Override
//    public int hashCode() {
//        return this.id;
//    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
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

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
