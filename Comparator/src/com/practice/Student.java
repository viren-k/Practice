package com.practice;

public class Student implements Comparable{
	int number;
	String name;
	String address;
	
	
	
	
	

	@Override
	public int compareTo(Object o) {
		
		return this.getName().compareTo(((Student)o).getName());
	}






	public Student(int number, String name, String address) {
		super();
		this.number = number;
		this.name = name;
		this.address = address;
	}






	public int getNumber() {
		return number;
	}






	public void setNumber(int number) {
		this.number = number;
	}






	public String getName() {
		return name;
	}






	public void setName(String name) {
		this.name = name;
	}






	public String getAddress() {
		return address;
	}






	public void setAddress(String address) {
		this.address = address;
	}





	
	
}
