package dailypractice.july.july4;

public class MultithreadingDemoMain {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        //Create a thread
        //try to run it multiple time and see main thread and thread class truns differently
        //this is called context switching
        ThreasClass threasClass = new ThreasClass();
        threasClass.start();
        for(int i = 0; i <10; i++){
            System.out.println("I am running inside a Main thread ");
        }

    }
}
