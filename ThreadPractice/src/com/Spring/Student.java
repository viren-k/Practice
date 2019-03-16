package com.Spring;

public class Student {
	int number;
	String name;
	
	static {
		System.out.println("inside student static method");
	}
	
	Student(){
		System.out.println("Inside student constructor");
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setNumber(int number) {
		this.number = number;
	}
//	public String getName() {
//		return name;
//	}
//	public int getNumber() {
//		return number;
//	}
	@Override
	public String toString() {
		return "Student [number=" + number + ", name=" + name + "]";
	}
	
	public void callme() {
		System.out.println("inside student init method");
	}
	
}
