package com.AlwaysDeadlock;

public class Lallan {

	public static void main(String[] args) {
		lallan1();
	}

	private static void lallan1() {
		Student s1 =  new Student(1,"a");
		Student s2 =  new Student(1,"a");
		
		Thread t1 = new Thread() {
			public void run() {
				Student.doSomethingStatic1();
			}
		};
		t1.start();
		
		System.out.println("in betwwen");
		Thread t2 = new Thread() {
			public void run() {
				Student.doSomethingStatic2();
			}
		};
		t2.start();
		
		
		
	}

}
