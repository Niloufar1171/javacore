package dailypractice.july.july5.gc;
//calling gc on null objects
//creating island of isolation
public class GCDemo {
    GCDemo gcDemo3 = new GCDemo();

    public static void main(String[] args) {
        GCDemo gcDemo1 = new GCDemo();
        GCDemo gcDemo2 = new GCDemo();

        gcDemo1.gcDemo3 = gcDemo2;
        gcDemo2.gcDemo3 = gcDemo1;

        gcDemo1 = null;
        gcDemo2 = null;

        gcDemo1 = gcDemo2;

        // gcdemo = null;
        //you can call the gc in this two ways!
       // System.gc(); uoi
        Runtime.getRuntime().gc();
        System.out.println("Main method is done");
    }

        @Override
       public  void finalize() throws Throwable{
            System.out.println("this is to print after the main is done");

    }
}
