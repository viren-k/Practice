package com.comparator.practice;

public class Employee {
	int empNo;
	String empAddress;
	String empName;
	
	public int getEmpNo() {
		return empNo;
	}
	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", empAddress=" + empAddress + ", empName=" + empName + "]";
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	protected String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Employee(int empNo, String empAddress, String empName) {
		super();
		this.empNo = empNo;
		this.empAddress = empAddress;
		this.empName = empName;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}

//	public int compareTo(Employee o) {
//		return this.getEmpAddress().compareTo(o.getEmpAddress());
//	}
	
	
}
