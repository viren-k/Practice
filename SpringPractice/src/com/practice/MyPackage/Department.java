package com.practice.MyPackage;

public class Department {
	String deptName;
	Employee e;
	
	
	
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public Employee getE() {
		return e;
	}
	public void setE(Employee e) {
		this.e = e;
	}
	
	public Department(String deptName, Employee e) {
		super();
		this.deptName = deptName;
		this.e = e;
	}
	@Override
	public String toString() {
		return "Department [deptName=" + deptName + ", e=" + e.toString() + "]";
	}
	public Department() {
		super();
		System.out.println("Department default constructor loaded");
	}
	
	
	public void callmeDepartment() {
		System.out.println("department callme called");
	}
	
	public void destroyMe() {
		System.out.println("destory me method called");
	}
	
}
