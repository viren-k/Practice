package com.cyclicbarrier;

import java.util.concurrent.CountDownLatch;

public class Thread1 implements Runnable {

	CountDownLatch cl;
	
	public Thread1(CountDownLatch cl) {
		this.cl=cl;
	}
	
	@Override
	public void run() {
		
		System.out.println("Thread1 down");
		
		cl.countDown();
		
		
		System.out.println("Thread 1 doing his work");
		
	}

}
