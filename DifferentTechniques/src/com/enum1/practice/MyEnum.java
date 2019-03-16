package com.enum1.practice;

public enum MyEnum {
	SUNDAY(1,"a"),
	MONDAY(2,"b"),
	TUESDAY(3,"c");
	
	int number;
	String name;
	
	MyEnum(int number, String name){
		this.name=name;
		this.number=number;
	}
}
