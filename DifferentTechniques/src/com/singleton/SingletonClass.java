package com.singleton;

public class SingletonClass {
	private static SingletonClass obj = new SingletonClass();
	
	private SingletonClass() {}
	
//	public SingletonClass(int i) {
//		// TODO Auto-generated constructor stub
//	}

	public static SingletonClass getInstance() {
		return obj;
	}
	
	
	public static void printValue() {
		System.out.println(a);
	}
	
	
	 static int a=0;
}
