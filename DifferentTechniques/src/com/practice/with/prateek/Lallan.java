package com.practice.with.prateek;

import java.util.concurrent.atomic.AtomicInteger;

public class Lallan {

	public static void main(String[] args) {
		AtomicInteger ai = new AtomicInteger(7);
		
		System.out.println("PreviousL:"+ai.get());
		
		int  temp = ai.addAndGet(4);
		
		System.out.println(temp);
		
	}

}
