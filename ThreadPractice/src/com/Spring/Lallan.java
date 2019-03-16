package com.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lallan {

	public static void main(String[] args) {
		System.out.println("hello");
		ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
		
		System.out.println("hello");
//		Student s1 = (Student) context.getBean("myStudent");
//		System.out.println(s1.toString());
//		
//		Class c = (Class) context.getBean("myClass");
//		System.out.println(c.toString());
//		
//		
//		Class c1 = (Class) context.getBean("myClass");
//		System.out.println(c1.toString());
//		
//		System.out.println(c==c1);
	}

}
