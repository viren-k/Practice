package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {

		Student s1 = new Student(1, "abbc","add1");
		Student s2 = new Student(2, "aabc", "aadd2");
		Student s3 = new Student(3, "abc", "abdd3");
		Student s4 = new Student(4, "abcc", "aaad4");
		Student s5 = new Student(5, "aqr", "aabd5");
		
		List<Student> list = new ArrayList<Student>();
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		
		
		System.out.println("Before:\n");
		list.forEach(student->System.out.println(student.getNumber()+" " +student.getName()+" "+student.getAddress()));
		System.out.println("\nAfter:\n");
		//Collections.sort(list);
		
		//Collections.sort(list, new AddressComparator().reversed());
		
		//list.sort(new AddressComparator().reversed());
		
		
		Comparator<Student> c = new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				return o1.getAddress().compareTo(o2.getAddress());
			}
			
		};
		
		
		Comparator<Student> c3 = (Student ss1, Student ss2)->{
			return ss1.getAddress().compareTo(ss2.getAddress());
		};
		
		
		Comparator<Student> c2 = (o1,o2)->o1.getAddress().compareTo(o2.getAddress());
				
		list.sort(c2.reversed());
		
		
		list.forEach(student->System.out.println(student.getNumber()+" " +student.getName()+" "+student.getAddress()));
		
	}

}
