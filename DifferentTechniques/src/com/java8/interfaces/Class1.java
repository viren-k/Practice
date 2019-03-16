package com.java8.interfaces;

public class Class1 implements Interface1 {

//	@Override
//	public void print() {
//		// TODO Auto-generated method stub
//		
//	}

	
	
	public static void main(String[] args) {
		Interface1 add = (x,y)-> x+y;
		Interface1 sub = (x,y)-> x-y;
		
		Class1 c1 = new Class1();
		
		System.out.println("Sum:"+add.operation(1, 2));
		
		
	}

@Override
public int operation(int a, int b) {
	// TODO Auto-generated method stub
	return 0;
}

	
}

