package com.semaphore1;

import java.util.concurrent.Semaphore;

public class Thread1 implements Runnable{

	
	Semaphore s =null;
	
	public Thread1(Semaphore s) {
		this.s=s;
	}
	
	@Override
	public void run() {
		
		try {
			this.s.acquire();
			Thread.sleep(1000);
			this.s.acquire();
			Thread.sleep(1000);
			this.s.acquire();
			Thread.sleep(1000);

			this.s.acquire();
			Thread.sleep(1000);

			this.s.acquire();
			Thread.sleep(1000);

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("T1 acquired permit");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//System.out.println("T1");
		
	}

}
