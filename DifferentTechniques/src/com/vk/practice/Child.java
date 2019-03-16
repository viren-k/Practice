package com.vk.practice;

public class Child extends Parent {

	 public Child(String abc, int a) {
		super(abc, a);
		// TODO Auto-generated constructor stub
	}

	public  static void main(String[] args) {
		 
		 Parent p = new Child("sdf", 2);
		 p.abc="jj";
		 
		 
		 String s1="xyz";
		 String s2 = new String("Xyz");
		 
		 if(s2==s2) {
			 System.out.println(1);
		 }else {
			 System.out.println(2);
		 }
		 if(s1.equalsIgnoreCase(s2)) {
			 System.out.println(3);
		 }else {
			 System.out.println(4);
		 }
		 
		 System.out.println(Math.ceil(-82.4));
		 System.out.println(Math.pow(-6, 2));
		 
	 }
	
}
