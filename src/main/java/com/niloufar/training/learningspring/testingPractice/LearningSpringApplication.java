package com.niloufar.training.learningspring.testingPractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;

@SpringBootApplication
public class LearningSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearningSpringApplication.class, args);
/*
		System.out.println("hello");
		leetcode_begginer leetcode_begginer = new leetcode_begginer();
		int[] nums = {2, 11, 15, 7};
		int target = 9;
		leetcode_begginer.twoSum(nums, target);
		System.out.println(leetcode_begginer.twoSum(nums, target));


		//java training day2
		int[] arr1 = new int[3];
		System.out.println(arr1.getClass().getName());

		// loop practicing
		Map<String, Integer> mymap = new HashMap<>();

		mymap.put("Niloufar", 123);
		mymap.put("Class", 345);

		for (Integer key : mymap.values()) {
			System.out.println();
		}
		//if I want to loop through the pairs
		for (Map.Entry pair : mymap.entrySet()) {
			System.out.println(pair.getKey() + ":" + pair.getValue());
		}
*/

//---------thread examples
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
//Basic
//Definitions -------------------------------------
		int x = 2;
		int [] y = {1,2,3,4};
		float fl = 3.5F;

		List<String> list1= new ArrayList();
		List <String> list2 = new LinkedList();
		List <String> list3 = new Vector();
		List <String> list4 = new Stack();

		ArrayList<String> arrlist1 = new ArrayList<String>();
		ArrayList<String> list=new ArrayList<String>();
		Stack<Character> stack = new Stack<Character>();


		list1.add("niloufar");
		list.add("Vijay");
		Iterator itr=list.iterator();


		while(itr.hasNext()){
			System.out.println(itr.next());
		}



	}
}
