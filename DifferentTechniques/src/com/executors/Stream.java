package com.executors;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Stream {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		
		list.add("hi");
		list.add("bi");
		list.add("ki");
		list.add("ti");
		list.add("bye");
		
		
		//list.forEach(a->System.out.println(a));
		
		
		
		List<String> b = list.stream().filter(s->s.contains("i")).collect(Collectors.toList());
		
	
		//Map<String, Integer> map = list.stream().filter(s->s.contains("i")).collect(Collectors.toMap(s, 1));
		
		//b.forEach(a->System.out.println(a));
				
				
		
		
		
	}

}
