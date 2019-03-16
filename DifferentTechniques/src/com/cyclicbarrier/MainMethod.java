package com.cyclicbarrier;

import java.util.concurrent.CountDownLatch;

public class MainMethod {

	public static void main(String[] args) throws InterruptedException {
		
		CountDownLatch cl = new CountDownLatch(2);
		
		Thread t1 = new Thread(new Thread1(cl));
		Thread t2 = new Thread(new Thread2(cl));
		
		System.out.println("Main thread starts");
		
		
		
		
		
		
		t1.start();
		t2.start();
		
		cl.await();
		
		System.out.println("Main thread finishes");
		
	}

}
