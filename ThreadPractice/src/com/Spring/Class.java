package com.Spring;

public class Class {
	Student s;
	
	static {
		System.out.println("inside class static method");
	}
	
	Class(){
		System.out.println("inside class constructor");
	}

	public Student getS() {
		return s;
	}

	public void setS(Student s) {
		this.s = s;
	}

	@Override
	public String toString() {
		return "Class [s=" + s.toString() + "]";
	}
	
	public void callme() {
		System.out.println("inside clsss init method");
	}
	
	public void mydestroy() {
		System.out.println("inside class destroy method");
	}
	
}
