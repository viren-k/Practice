package com.practice.MyPackage;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Test {

	public static void main(String args[])
	{
		Map<String,Employee> mp = new HashMap<String, Employee>();
		Map<String,Employee> mpSmall = new HashMap<String, Employee>();
		
		
		Employee e1 = new Employee(1,"abc");
		Employee e2 = new Employee(2,"pqr");
		Employee e3 = new Employee(3,"xyz");
		
		mp.put("first", e1);
		mp.put("second", e2);
		mp.put("third", e3);
		
		for(Entry<String, Employee> entry : mp.entrySet())
		{
			String s = entry.getKey();
			//Employee e = new Employee(entry.getValue().getRollNumbrt(), entry.getValue().getEmpName());
			
			
			Employee e = new Employee(entry.getValue());
			
			if(s.length()==5)
			{
				mpSmall.put(s, e);
			}

			
		}
		
		mpSmall.get("first").empName = "abc new";
		
		mp.forEach((k,v)->{
			System.out.println(v.toString());
		});
		
		
	}
	
}
