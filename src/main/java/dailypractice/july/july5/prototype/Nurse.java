package dailypractice.july.july5.prototype;
public class Nurse extends Profession {

    @Override
    public void print(){
        System.out.println("My profesion is Nurse");
    }

    @Override
    public String toString() {
        return "Nurse{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
