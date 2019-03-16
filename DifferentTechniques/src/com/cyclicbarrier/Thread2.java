package com.cyclicbarrier;

import java.util.concurrent.CountDownLatch;

public class Thread2 implements Runnable {

	CountDownLatch cl;
	
	public Thread2(CountDownLatch cl) {
		this.cl=cl;
	}
	
	
	public void run() {
		
		System.out.println("Thread 2 sleeping");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		cl.countDown();
		
		System.out.println("Thread 2 up");

	}

}
