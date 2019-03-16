package com.ThreadPractice;

public class ThreadDemo {

	public static void main(String args[]) throws InterruptedException	{
		
		
		MyThread obj1 = new MyThread(0);
		MyThread obj2 = new MyThread(0);
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		
//		t1.start();
//		//Thread.sleep(100);
//		t2.start();
//		
		
		
		Runnable t3 = ()-> System.out.println("HI'");
		
		
		
	}
	
}
