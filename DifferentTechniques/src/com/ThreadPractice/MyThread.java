package com.ThreadPractice;

public class MyThread implements Runnable {

	int i;
	
	MyThread(int i){
		this.i=i;
		System.out.println("Initialized:"+this.i);
	}
	
	@Override
	public void run() {
		synchronized(this) {
			for(int j=0;j<10;j++) {
				System.out.println("Started Printing:"+Thread.currentThread().getName()+":"+i++);
			}
		}
	}
	
	


}
