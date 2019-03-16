package com.comparator.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorTest {
 

	public static void main(String[] args) {
		
		List<Employee> empList = new ArrayList<Employee>();
	
		Employee e1 = new Employee(777,"ac","ac");
		Employee e2 = new Employee(23,"bbbb","bbbb");
		Employee e3 = new Employee(3,"c","c");
		Employee e4 = new Employee(10,"aaa","aaa");
		
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		
		System.out.println("Before");
		
		empList.forEach(a->{
			System.out.println(a.toString());
		});	
		
		AddLenghtComparator alc= new AddLenghtComparator();
			
		System.out.println("After");
		
		
		
		
		//Collections.sort(empList);
		
//		Collections.sort(empList, new Comparator<Employee>() {
//
//			@Override
//			public int compare(Employee o1, Employee o2) {
//				// TODO Auto-generated method stub
//				return o1.getEmpAddress().compareTo(o2.getEmpAddress());
//			}
//			
//		});
		
		
		//Java 8 using lambda expession
		
		//empList.sort((emp1,emp2)->emp1.getEmpNo()-emp2.getEmpNo());
		//empList.sort((emp1,emp2)->emp1.getEmpAddress().compareTo(emp2.getEmpAddress()));
		
//		Comparator<Employee> c = new Comparator<Employee>(){
//
//			@Override
//			public int compare(Employee o1, Employee o2) {
//				return o1.getEmpAddress().compareTo(o2.getEmpAddress());
//			}
//			
//		};
		
		//empList.sort(c);
		//empList.sort(c.reversed());
		//Collections.sort(empList, c.reversed());
		
//		empList.sort( new Comparator<Employee>() {
//
//			@Override
//			public int compare(Employee o1, Employee o2) {
//				// TODO Auto-generated method stub
//				return o1.getEmpAddress().compareTo(o2.getEmpAddress());
//			}
//			
//		});
		
		empList.sort((Employee e11, Employee e21)->e11.getEmpAddress().compareTo(e21.getEmpAddress()));
		
		empList.forEach(a->{
			System.out.println(a.toString());
		});	
	}

}
