package com.innerclasses;

public class Outer {
	
	int number =22;
	
	public void Print() {
		
		class Inner{
			
			public void PrintInner() {
				System.out.println("number:"+number);
			}
			
			
		}
		Inner i = new Inner();
		i.PrintInner();
		
		
	}
	
	

}
