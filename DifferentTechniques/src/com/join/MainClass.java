package com.join;

public class MainClass {

	public static void main(String[] args) throws InterruptedException {
		
		Student s1 = new Student();
		Student s2 = new Student();
		
		Thread t1 = new Thread(s1);
		Thread t2= new Thread(s2);
		
		t1.start();
		//t1.join();
		t2.start();
		
	}

}

