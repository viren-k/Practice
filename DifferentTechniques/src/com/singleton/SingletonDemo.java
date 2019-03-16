package com.singleton;

public class SingletonDemo {
	public static void main(String args[]) {
		
		SingletonClass newObj = SingletonClass.getInstance();
		newObj.printValue();
		
		newObj.a=22;
	}
}
