package com.threads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class Student implements Callable
//public class Student extends Thread
{
	String name;

	public Student(String name) {
		super();
		this.name = name;
	}
	


	@Override
	public ArrayList<String> call() throws Exception {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(this.name);
		List<String> arrayList = new ArrayList<String>();
		arrayList.add("hi");
		return (ArrayList<String>) arrayList;
	}

	
	
	
		
}
