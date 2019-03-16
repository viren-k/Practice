package com.semaphore1;

import java.util.concurrent.Semaphore;

public class SemaphoreMain {

	public static void main(String[] args) {

		Semaphore s = new Semaphore(6);
		
		Thread1 t1 = new Thread1(s);
		Thread2 t2 = new Thread2(s);
		
		new Thread(t1).start();
		new Thread(t2).start();
		
	}

}
