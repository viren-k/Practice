package com.semaphore;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.stream.IntStream;


public class Main {
	public static void main(String args[]) {
		
		Semaphore s = new Semaphore(3);
		//Mutex m = new Mutex();
		
		ExecutorService es = Executors.newScheduledThreadPool(10);
		
		IntStream.range(0, 9).parallel().forEach(i->{
			es.submit(new Thread1(s));
		});
	}
}
