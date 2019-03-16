package com.executors;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.IntStream;

public class MainMethod {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		ExecutorService es = Executors.newFixedThreadPool(3);
		
		
		
		Callable  r = () ->{
			ArrayList<String> a = new ArrayList<String>();
			try {
				Thread.sleep(2000);
				System.out.println("HI");
				
				a.add("HI");
				a.add("bye");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return a; 

		
		};
		Future<ArrayList<String>> f = es.submit(r);
		
		ArrayList<String> t = f.get();
		
		t.forEach(s->System.out.println(s));
		
		//IntStream.range(0, 3).parallel()

	}
}
