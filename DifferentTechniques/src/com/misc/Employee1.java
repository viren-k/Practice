package com.misc;

public class Employee1 {
	int empId;
	 protected static int myName;
	
	public int getEmpId() {
		return empId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empId;
		return result;
	}

	public Employee1(int empNo) {
		super();
		this.empId = empNo;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee1 other = (Employee1) obj;
		if (empId != other.empId)
			return false;
		return true;
	}
	
	
}
