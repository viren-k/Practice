package com.countdownlatch;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Thread1 implements Runnable {

	CyclicBarrier cl;
	
	public Thread1(CyclicBarrier cl) {
		this.cl=cl;
	}
	
	@Override
	public void run() {
		
		System.out.println("Thread1 down");
		
		try {
			cl.await();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (BrokenBarrierException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
		System.out.println("Thread 1 doing his work");
		
	}

}
