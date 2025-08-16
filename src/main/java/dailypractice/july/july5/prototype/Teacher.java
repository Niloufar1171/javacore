package dailypractice.july.july5.prototype;

public class Teacher extends Profession {

    @Override
    public void print(){
        System.out.println("My profession is Teacher:");
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
