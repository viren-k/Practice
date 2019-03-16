package com.nullkeys;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeSet;
import java.util.stream.Stream;

import com.misc.Employee1;

public class MyTest extends Employee1{

	public MyTest(int empNo) {
		super(empNo);
	}

	public static void main(String[] args) {
		//Lallan();
		//lallan2();
		//allan3();
		lallan4();
	}
	public static void lallan4() {
		TreeSet<String> a = new TreeSet<String>();
		
		a.add("hi");
		a.add(null);
		
		System.out.println("sysout");
		a.forEach(k->System.out.println(k));
		
	}

	private static void lallan3() {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		
		Stream<Integer> aStream = a.parallelStream();
		aStream.filter(ab-> ab>2);
		
		a.forEach(abc-> {
			System.out.println(abc);
		});
		
		System.out.println("hi");
	}

	private static void lallan2() {
		System.out.println(myName);
	}

	private static void Lallan() {
		Map<String, String> myMap = new HashMap<String, String>();
		
		myMap.put(null, "hi");
		myMap.put("1", null);
		
		
		System.out.println(myMap.get(null));
	
	}

}
