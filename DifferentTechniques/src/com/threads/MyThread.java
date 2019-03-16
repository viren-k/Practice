package com.threads;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;


public class MyThread {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		
		
		ScheduledExecutorService sec = Executors.newScheduledThreadPool(10);
		
		
		
		for(int i=1;i<15;i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			Student s1 = new Student("Thread"+i);
			Future a = sec.submit(s1);
			ArrayList<String> my = (ArrayList<String>) a.get();
			
			my.stream().forEach( str->{
				System.out.println(str);
			});
		}
	}

}
