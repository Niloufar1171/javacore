package dailypractice.july.july3.prototype;
//interfaces can not implement each other! here profesion becomes an abtract class to implement the clonale
public abstract class Profession implements Cloneable{
   public int id;
   public String name;
   abstract void print();
//defiing how to clone an object!
   public Object clonableMethod(){
       Object clone = null;
       try{
           //supper is nothing but the clonable methon in  the clonable!
           clone = super.clone();
       }catch(CloneNotSupportedException e ){
           e.printStackTrace();
       }
       return  clone;
   }

    @Override
    public String toString() {
        return "Profession{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

}
