package com.comparator.practice;

import java.util.Comparator;

class AddLenghtComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.getEmpAddress().compareTo(o2.getEmpAddress());
		
	}

}
