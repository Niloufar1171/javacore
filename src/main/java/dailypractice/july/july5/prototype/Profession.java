package dailypractice.july.july5.prototype;

public abstract class Profession implements Cloneable{
    public String name;
    public int id;
    abstract void print();

    public Object cloningMethod() throws CloneNotSupportedException {

        Object clone = super.clone();
        return clone;
    }

}
