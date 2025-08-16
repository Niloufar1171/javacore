package dailypractice.jan;

import java.util.Objects;

public class Company {
    String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return Objects.equals(name, company.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "company{" +
                "name='" + name + '\'' +
                '}';
    }

    public Company(String name) {
        this.name = name;
    }
}
