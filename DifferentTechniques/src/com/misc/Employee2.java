package com.misc;

public class Employee2 {
	String name;
	int empId;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpId() {
		return empId;
	}
	
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public Employee2(String name, int empId) {
		super();
		this.name = name;
		this.empId = empId;
	}
	
	@Override
	public int hashCode() {
		return name.length();
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee2 other = (Employee2) obj;
		
		return(other.getName().length()==name.length());
	}
	@Override
	public String toString() {
		return "Employee2 [name=" + name + ", empId=" + empId + "]";
	}
	
	
}
