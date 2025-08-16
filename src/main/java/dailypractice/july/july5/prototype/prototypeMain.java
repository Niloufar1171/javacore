package dailypractice.july.july5.prototype;
//creating dublicates object while keeping the performance in mind
public class prototypeMain {
    public static void main(String[] args) throws CloneNotSupportedException {
       ProfessionCache.loadProfessionCache();

       Profession doc = ProfessionCache.getCloneNewProfession(1);
        System.out.println(doc);

        Profession nurse = ProfessionCache.getCloneNewProfession(2);
        System.out.println(doc);

        Profession teacher = ProfessionCache.getCloneNewProfession(3);
        System.out.println(doc);

   //Testing to see if everytime I get a new Instace by checking hashcode!
        System.out.println("***************************************");

        Profession doc2 = ProfessionCache.getCloneNewProfession(1);

        System.out.println("Checing hash codes :"+  doc.hashCode() + " "+ doc2.hashCode() );
    }
}
