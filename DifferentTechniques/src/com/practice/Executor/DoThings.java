package com.practice.Executor;

import java.util.concurrent.Callable;

public class DoThings implements Callable{

	@Override
	public Object call() throws Exception {
		System.out.println("Entering inside:"+Thread.currentThread().getName());
		Thread.sleep(3000);
		System.out.println("Getting out:"+Thread.currentThread().getName());
		return "hi";
	}

}
