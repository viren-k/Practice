package com.practice.MyPackage;

public class Employee {

	int empNumber;
	String empName;
	
	static {
		System.out.println("static block 1loaded");
	}
	
	public int getRollNumbrt() {
		return empNumber;
	}
	public void setEmpNumber(int empNumber) {
		this.empNumber = empNumber;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	@Override
	public String toString() {
		return "name="+this.empName+" roll number="+this.empNumber;
	}
	
	public Employee(int empNumber, String empName) {
		super();
		this.empNumber = empNumber;
		this.empName = empName;
		System.out.println("parameterized constructor loaded");
		System.out.println("name:"+this.empName);
	}
	public Employee() {
		
		System.out.println("employee default constructor loaded");
		System.out.println("name:"+this.empName);
	}
	
	{
		System.out.println("#######################");
		System.out.println("emp 1 paranthesis loaded");
	}
	static {
		System.out.println("static block2 loaded");
		
	}
	
	public void callme() {
		System.out.println("employee Called callme method");
		System.out.println("name:"+this.empName);
	}
	
	Employee(Employee e){
		this.empNumber=e.empNumber;
		this.empName = e.empName;
	}
	
	
}
