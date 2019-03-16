package com.AlwaysDeadlock;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class MyMain {

	public static void main(String[] args) {
		
		Student s1 = new Student(1,"a");
		Student s2 = new Student(2,"b");
		
		CyclicBarrier cb = new CyclicBarrier(2);
			
		Thread t1 = new Thread() {

			@Override
			public void run() {
				try {
					doSomething(s1,s2,cb);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (BrokenBarrierException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		};
		
		t1.start();
		
		
		Thread t2 = new Thread() {
			public void run() {
				try {
					doSomething(s2,s1,cb);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (BrokenBarrierException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
//		try {
//			//t2.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
		System.out.println("Ending all");
	}

	protected static void doSomething(Student s1, Student s2, CyclicBarrier cb) throws InterruptedException, BrokenBarrierException {
		System.out.println("Thread name:"+Thread.currentThread().getName());
		synchronized(s1){
			System.out.println("Got lock on :"+s1.toString());
			System.out.println("Waiting for:"+s2.toString());
			cb.await();
			synchronized(s2){
				System.out.println("Got lock");
			}
		}
		
		
	}

}
