package com.practice.mypractice2;

public class ChildC extends ParentC {
	
	public ChildC(int a) {
		super(a);
		this.a=a;
		
	}
	int a;
	
	//@Override
	public void PrintA() {
		//System.out.println("Child print a:"+this.a);
		super.PrintA();
	}

}
