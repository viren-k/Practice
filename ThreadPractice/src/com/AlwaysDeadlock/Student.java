package com.AlwaysDeadlock;

import java.util.HashMap;

public class Student {
	int number;
	String name;
	
	public static HashMap<Integer,Integer> hm ;
	static {
		hm=new HashMap<Integer,Integer>();
		hm.put(1, 1);
		hm.put(2, 2);
	}
	
	
//	
//	hm.put(1,1);
//	hm.put(2,3);
//	hm.put(3,3);
//	
	
	public Student(int number, String name) {
		super();
		this.number = number;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [number=" + number + ", name=" + name + "]";
	}
	
	public void PrintName() {
		System.out.println("Name is:"+this.name);
	}
	
	public void PrintNumber() {
		System.out.println("Number is"+this.number);
	}
	
	
	public synchronized void PrinatAll() {
		System.out.println(this.toString());
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Exiting");
	}
	
	public synchronized void PrintAnything() {
		System.out.println("Anythign");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Exiting");
	}
	
	
	public void doSomething() {
		System.out.println("INside do something");
		synchronized(this){
			System.out.println("Inside synchronized");
		}
	}
	
	
	public synchronized static void doSomethingStatic1() {
		
		System.out.println("inside do something static1");
		try {
			for(int i=0;i<100;i++) {
				Thread.sleep(1000);
				hm.put(i, i);
			}
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Exiting dosomehting static1");
		
	}
	
	public static void doSomethingStatic2() {
		
		System.out.println("inside do something static2");
		try {
			Thread.sleep(3000);
			hm.forEach((k,v)->System.out.println(k+","+v));
			
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Exiting dosomehting static2");
		
	}
}
