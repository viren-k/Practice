package com.enumPractice;

public enum Client {
	ACCOUNT;
	
	int a;
	static int b;
	
	public void setValue(int a, int b) {
		this.a=a;
		this.b=b;
	}
	
	public void PrintValue() {
		System.out.println(a);
		System.out.println(b);
	}

	
	
	
}
