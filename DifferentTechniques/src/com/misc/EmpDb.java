package com.misc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.comparator.practice.Employee;


public class EmpDb extends Employee{

	public static void main(String[] args) {
		//lallan();   //hashmap
		//lallan1();  //hashmap
		lallan3();  //hashmap
		//lallan4();   //wrapper classes autoboxing unboxing
		//lallan5();     //wrapper object passing
		//lallan6();  //list add
		
	}

	private static void lallan6() {
		
		List<Integer> myList = new ArrayList<Integer>();
		myList.add(2);
		
	}

	private static void lallan5() {
		List myList = new ArrayList<Integer>();
		
		Integer a=new Integer(10);
		int b=20;
		
		System.out.println("Before: a="+a+", b="+b);
		
		changeValues(a,b);
		
		System.out.println("After: a="+a+", b="+b);
		
	}

	private static void changeValues(Integer a, int b) {
		a=a.intValue()+10;
		b=b+10;
		
	}

	private static void lallan4() {
		Integer x=400, y=400;
		Integer a=30, b=30;
		
		
		System.out.println(x);
		System.out.println(a);
		if(x==y) {
			System.out.println("x and y are same");
		}
		else {
			System.out.println("x and y are not same");
		}
		if(a==b) {
			System.out.println("a and b are same");
		}
		else {
			System.out.println("a and b are not same");
		}	
		
	}

	private static void lallan3() {
		Employee2 e1= new Employee2("viru",1);
		Employee2 e2= new Employee2("anil",2);
		Employee2 e3= new Employee2("ajib",3);
		Employee e4 = new Employee(1,"viru","Jerseyt city");
		
		EmpDb e = new EmpDb();
		
		System.out.println("Default:"+e4.getEmpNo());
		System.out.println("Portected:"+e.getEmpAddress());

		
		Map<Employee2,Integer> empDb= new HashMap<Employee2, Integer>();
		
		empDb.put(e1, e1.getEmpId());
		empDb.put(e2, e2.getEmpId());
		empDb.put(e3, e3.getEmpId());
		
//		System.out.println(e1.hashCode());
//		System.out.println(e2.hashCode());
//		System.out.println(e3.hashCode());
//		
		for(Map.Entry e11: empDb.entrySet()) {
		//	System.out.println(e11.getKey().toString()+ " "+e11.getValue());
		}
		
		
		empDb.forEach((key,value)->{
			System.out.println(key+" "+value);
		});
		
		
	}

	private static void lallan1() {
		Employee1 e1 = new Employee1(12);
		Employee1 e2 = new Employee1(14);
		Employee1 e3 = new Employee1(17);
		
		Map<Integer, Employee1> empDb = new HashMap<Integer, Employee1>();
		
		
		empDb.put(e1.getEmpId(), e1);
		empDb.put(e2.getEmpId(), e2);
		empDb.put(e3.getEmpId(), e3);
		
		
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		System.out.println(e3.hashCode());
		
		for(Map.Entry e: empDb.entrySet()) {
			System.out.println(e.getKey());
		}
		
	}

	private static void lallan() {
		Employee3 e1 = new Employee3("viru", 12);
		Employee3 e2 = new Employee3("Boss", 14);
		Employee3 e3 = new Employee3("Anil", 17);
		
		Map<Integer, Employee3> empDb = new HashMap<Integer, Employee3>();
		
		
		empDb.put(e1.getEmpId(), e1);
		empDb.put(e2.getEmpId(), e2);
		empDb.put(e3.getEmpId(), e3);
		
		
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		System.out.println(e3.hashCode());
		
		for(Map.Entry e: empDb.entrySet()) {
			System.out.println(e.getKey()+ " "+((Employee3)e.getValue()).getName());
		}
		
	}

}
