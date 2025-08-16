package dailypractice.july.july7;

public class StringDemo {
    public static void main(String[] args) {

//         jvm search for a string with the same value and if exists point to it.
//        everytime we have new keyword we have a new memory and address is not the same. s2,s4,s5
//        have all different memory address!

        String  s1 = "code";
        String  s2 = "code";
        String s3= new String("code");

        ////an object is going to be created in heap but also jvm would create another one in spring constant pool
        // in case in future there is a s5 created thats why hash codes of all same values are the same but Memory value address NOT!
        String s4 = new String("ab");
        String s5 = "ab";

        System.out.println("-------------------------------------------------------------------------");
        System.out.println("s1 pointing to the heap memory area ! s2 are pointing at the same string pool : " + (s1 ==s2) );
        System.out.println("S1 and S2 hashcode : " + s1.hashCode() + " , " + s2.hashCode());

        System.out.println("-------------------------------------------------------------------------");
        System.out.println("s1 ! and s3  pointing to the heap memory area : " + (s1 ==s3) );
        System.out.println("S3 hashcode creating with new keyword : " + s1.hashCode() + " , " + s3.hashCode());

        System.out.println("-------------------------------------------------------------------------");
        System.out.println("s4 : 2 new object is created in heap and SCP but pointing to only heap, S5 no object create only a pointer to existing object: ");
        System.out.println("Comparing 2 pointers " + (s4== s5) + " , Comparing the value they are pointing at : " + (s4.equals(s5)));
        System.out.println("S4 hashcode showing the address of the object value  : " + s4.hashCode());
        System.out.println("S5 hashcode showing the address of the object value  : " + s5.hashCode());

        //there would not be any same object in the string pool !
        System.out.println("-------------------------------------------------------------------------");
        String String6 = new String("Repeatation"); //2 object is created one in heap one in pool in case we want to use it as string = "Repeatation"
        String String7 = new String("Repeatation");//only one object in heap will be created there is one already existed in spring pool from previous line
///
        String immutable = "modify me";
        System.out.println(immutable.hashCode());
        immutable = immutable + "sth";
        System.out.println("Can I modify my string? " + immutable.hashCode());
    }
}
