package com.semaphore1;

import java.util.concurrent.Semaphore;

public class Thread2 implements Runnable {

	Semaphore s= null;
	
	public Thread2(Semaphore s) {
		this.s = s;
	}
	
	
	@Override
	public void run() {
		
		System.out.println("T2 trying to acquire");
		
		try {
			this.s.acquire();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("T2 acquired permit");
		
		
		
		while(s.availablePermits() >0) {
			System.out.println("Permits available:"+s.availablePermits());
		}
			System.out.println("permits not available");
		
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
