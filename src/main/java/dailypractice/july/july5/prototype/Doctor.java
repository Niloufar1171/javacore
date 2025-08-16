package dailypractice.july.july5.prototype;

public class Doctor extends Profession {

    @Override
    public void print(){
        System.out.println("My profession is docotor " );
    }
@Override
    public String toString(){
        return  "id is :"+ super.id +" name is : "+ super.name;
}

}
