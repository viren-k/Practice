package com.demon;

public class Main {
	public static void main(String args[]) throws InterruptedException {
		
		System.out.println(Thread.currentThread().isDaemon());
		
		Thread t1 = new Thread(new Runnable() {
			
			
			@Override
			public void run() {
				System.out.println("inside thread");
				System.exit(1);
			}
			
		});
		
		t1.start();
		//t1.run();
		
		
		for(int i=0;i<60000000;i++) {
			//Thread.sleep(1000);
			System.out.println("hi");
		}
		
		
		
	}
}
