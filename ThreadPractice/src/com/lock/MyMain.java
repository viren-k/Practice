package com.lock;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class MyMain {

	public static void main(String[] args) {
		
		Student s = new Student();
		s.a=2;
		
		change(s);
		System.out.println(s.a);
		
		
	
		
	}

	private static void change(Student a) {
		a.a=4;
		
	}

}
