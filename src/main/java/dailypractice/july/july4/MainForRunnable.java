package dailypractice.july.july4;
//you will see the result it is run randomly showing the context switching concepts!
public class MainForRunnable {
    public static void main(String[] args) {
        RunnableClass runnableInstance = new RunnableClass();
        Thread thread = new Thread(runnableInstance);
        thread.start();

        for(int i = 0; i <100; i++){
            System.out.println("I am running as Main thread ");
        }
    }
}
