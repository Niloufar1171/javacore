package com.niloufar.training.learningspring.Multithreading;

public class threadExamples implements  Runnable{
private  int number;
private String threadname;

    public threadExamples(int number, String threadname) {
        this.number = number;
        this.threadname = threadname;
    }

    @Override
    public void run() {
        for (int i = 1; i < 5; i++) {
            System.out.println("thread : " + threadname + "is counting "+  i + " " );
        }
    }

    public static void main(String[] arg) {
        threadExamples mythred1 = new threadExamples(10,"thread 1 ");
        threadExamples mythred2 = new threadExamples(11, "thread 2");


        mythred1.run();
        mythred2.run();
/*
		threadExamples t = new threadExamples(0);  // ofcourse the thread class should extend the Thread clas

		// creating thread with runnable class

		//basic methode
		threadExamples myrunnable = new threadExamples(1);
		Thread thread1 =new Thread(myrunnable);
		thread1.start();

       //creating thread passing directly our thread class

		Thread thread2 = new Thread(new threadExamples(2));
		thread2.start();
//using lambda ;)
		Thread thread3 = new Thread(() -> {
			for (int i = 1; i < 5; i++) {
				System.out.println(i + " " + Thread.currentThread().getName());
			}
		});
		thread3.start();

//Code challenge bakery
		Design d1 = new Design(1,"Design-1");
		Thread t1 = new Thread(new VotingRunnable(d1));
		Thread t0 = new Thread(new VotingRunnable(new Design(0,"Design-0")));
		Thread c1 = new Thread(new CountingRunnable(new Design(1,"Design-1")));

		t1.start();
		c1.start();
*/
    }

}



