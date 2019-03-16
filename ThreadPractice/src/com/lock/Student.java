package com.lock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Student implements Runnable{
	
	Lock lock = new ReentrantLock();
	int a =2;
	public void PrintSomething() {
		lock.lock();
		try {
//			for(int i=0;i<10;i++) {
//				System.out.println(Thread.currentThread().getName());
//				Thread.sleep(1000);
//			}
			System.out.println("insinde printsomething"+Thread.currentThread().getName());
			mthod1();
			
		} 
//		catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		finally {
			lock.unlock();
		}
	}
	private synchronized void mthod1() {
		
			System.out.println("Inside method 1:"+Thread.currentThread().getName());
		
			
		
	}
	@Override
	public void run() {
		PrintSomething();
	}
	
	
}
