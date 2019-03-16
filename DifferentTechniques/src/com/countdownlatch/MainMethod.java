package com.countdownlatch;

import java.util.concurrent.CyclicBarrier;

public class MainMethod {

	public static void main(String[] args) throws InterruptedException {
		
		CyclicBarrier cl = new CyclicBarrier(2);
		
		Thread t1 = new Thread(new Thread1(cl));
		Thread t2 = new Thread(new Thread2(cl));
		
		System.out.println("Main thread starts");
		
		
		
		
		
		
		t1.start();
		t2.start();
		
		
		
		System.out.println("Main thread finishes");
		
	}

}
