package com.semaphore;

import java.util.concurrent.Semaphore;

public class Thread1 implements Runnable {

	
	Semaphore s ;
	
	public Thread1(Semaphore s ) {
		this.s = s;
	}
	
	
	public void run() {
		
		try {
			
			System.out.println(Thread.currentThread().getName()+"trying for permit");
			s.acquire();
			
			System.out.println(Thread.currentThread().getName()+"got the permit");
			Thread.sleep(3000);
			
			System.out.println(Thread.currentThread().getName()+"Released the premis");
			
			s.release();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
