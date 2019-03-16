package com.countdownlatch;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Thread2 implements Runnable {

	CyclicBarrier cl;
	
	public Thread2(CyclicBarrier cl) {
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
		try {
			cl.await();
		} catch (InterruptedException | BrokenBarrierException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Thread 2 up");

	}

}
