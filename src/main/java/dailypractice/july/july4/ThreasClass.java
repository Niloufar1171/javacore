package dailypractice.july.july4;

public class ThreasClass extends Thread{

    @Override
    public void run(){
        for(int i = 0; i <100; i++){
            System.out.println("Child thread " + "[" + i + "]");
            System.out.println("Child thread demon thread or not ? " + currentThread().isDaemon());
            System.out.println("Child Thread name is : "+ currentThread().getName());
        }
    }
}
