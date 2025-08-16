package dailypractice.july.july4;

public class RunnableClass implements Runnable{
    @Override
    public void run() {
        for(int i = 0; i <100; i++){
            System.out.println("I am running as a Child thread");
        }
    }

}
