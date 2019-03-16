package com.practice.KeywordVolatile;


public class Lallan {
	
	//boolean volatile flag = false;
	static boolean flag=true;
	
	public static void main(String[] args) throws InterruptedException {
		Thread t = new Thread(new MyThread());
		t.start();
		
		Thread t2 = new Thread(new MyThread());
		t2.start();
		
	}
}


class MyThread implements Runnable{

	@Override
	public void run() {
		int i=0;
		while(Lallan.flag) {
			System.out.println("inside while but outside for");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i++);
		}
		
	}
	
}

class MyThread1 implements Runnable{

	@Override
	public void run() {
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Turning flag false from MyThread1");
		Lallan.flag=false;
	}
	
}