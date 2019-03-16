package com.enum1.practice;

public class EnumTest {

	
	public static void main(String[] args) {
		
		int a=2;
		
		MyEnum me =getEnum(a);
		System.out.println(me.number);
	}

	private static MyEnum getEnum(int a) {
		
		switch(a) {
			case 1:return MyEnum.MONDAY;
			case 2:return MyEnum.SUNDAY;
			case 3:return MyEnum.TUESDAY;
		};
		
		return null;
	}

}
