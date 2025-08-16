package dailypractice.july.july4;
//demon thread becomes the low priority thread
//So whenever JVM done with the for loop the demon thread is going to stop!
public class DaemonDemo {
    public static void main(String[] args) {
        ThreasClass threasClass = new ThreasClass();
        threasClass.setDaemon(true);
        threasClass.start();


        for(int i = 0; i <100; i++){
            System.out.println("I am running as Main thread " + i);
        }
    }

}
