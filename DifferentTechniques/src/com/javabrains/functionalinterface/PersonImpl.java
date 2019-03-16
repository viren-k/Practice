package com.javabrains.functionalinterface;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class PersonImpl {

	public static void main(String[] args) {

		List<Person> personList = Arrays.asList(
				new Person("xwyz","abc",50),
				new Person("pqr","abc",44),
				new Person("abc","abc",33),
				new Person("wxy","abc",88),
				new Person("mnl","abc",12)
				);
				
				
//		Comparator<Person> c = new Comparator<Person>() {
//
//			@Override
//			public int compare(Person o1, Person o2) {
//				
//				return o1.getFirstName().compareTo(o2.getFirstName());
//			}
//			
//		};
		
		personList.sort(( o1,  o2)->{
			return o1.getFirstName().compareTo(o2.getFirstName());
		});
		
		PrintI p1 = (anyList, anyString)->{
			if(anyString.isEmpty()) {
				anyList.forEach(obj ->System.out.println(obj.toString()));
			}else {
					anyList.forEach(obj ->{
						if(obj.getFirstName().startsWith(anyString))
							System.out.println(obj.toString());
					});
			}
		};
		
		p1.Print(personList, "");
		System.out.println("====================");
		p1.Print(personList, "w");
	}

}

interface PrintI{
	public void Print(List<Person> l,String s);
}



