package com.practice.MyPackage;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class MainClass {
	
//	static{
//		System.out.println("static block of main called");
//	}
	
	
	public static void main(String[] args) {
		
		
//		System.out.println("######obj1#########3\n");
//		
//		
//		
//		Employee employee4 = new Employee();
//		employee4.setEmpName("aa");
//		employee4.setEmpNumber(4);
//		System.out.println(employee4.toString());
//		
//		System.out.println("######obj2########\n");
//		
//		
//		Employee employee3 = new Employee(3,"bacchan");
//		System.out.println(employee3.toString());
//		
//		System.out.println("######obj3########\n");
//		
		ApplicationContext myBean = new ClassPathXmlApplicationContext("SpringBean.xml");
		Employee employee1 = (Employee)myBean.getBean("employee1");
		System.out.println(employee1.toString());
//		
//		System.out.println("######obj4########\n");
//		
//		Employee employee2 = (Employee)myBean.getBean("employee2");
//		System.out.println(employee2.toString());
//		
//		
//		System.out.println("######obj5#########3\n");
//		
//		Employee employee5 = new Employee();
//		employee5.setEmpName("aa");
//		employee5.setEmpNumber(4);
//		System.out.println(employee5.toString());
//		
//		System.out.println("######comparision#########3\n");
//
//		
//		Employee employee6 = (Employee)myBean.getBean("employee6");
//		System.out.println(employee6.toString());
//		
//		//employee2.setEmpName("change");
//		
//		if(employee6==employee2) {
//			System.out.println("2 & 6 are equal");
//		}else {
//			System.out.println("2 & 6 are not equal");
//		}
//		
//		System.out.println(employee2.toString());
//		System.out.println(employee6.toString());
//		
		//employee2.setEmpName("change");
		
		Department department1= (Department) myBean.getBean("department1");
		System.out.println(department1.toString());
		
//		if(employee6 == department1.getE()) {
//			System.out.println("botha re same");
//		}else {
//			System.out.println("both are different");
//		}
//		
		
	}
}
