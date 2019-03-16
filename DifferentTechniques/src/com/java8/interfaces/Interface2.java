package com.java8.interfaces;

@FunctionalInterface
public interface Interface2 {

	default void myLallan1() {
		System.out.println("inside interface2 mylallan1");
	}

	default int myLallan2() {
		System.out.println("inside interface2 mylallan2");
		return 1;
	}
	static void myLallan3() {
		System.out.println("inside interface2 mylallan3");
	}
	
	static void myLallan4() {
		System.out.println("inside interface2 mylallan4");
	}
	
	default void myLallan5() {
		System.out.println("inside interface2 mylallan4");
	}
	void myLalln6();
	//void myLalln7();
}
