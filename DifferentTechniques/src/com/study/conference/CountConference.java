package com.study.conference;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;

public class CountConference {

	public static void main(String[] args) {
		try {
			File file = new File("/Users/virendrakhandade/Documents/Dunia/IndiaConference.txt");
			int count=0;
			HashMap<String,Integer> confCount = new HashMap<String, Integer>();
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			StringBuffer stringBuffer = new StringBuffer();
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				stringBuffer.append(line);
				stringBuffer.append("\n");
				String name =  StringUtils.substringBetween(line, "(", ")");
				
				count = confCount.containsKey(name)? confCount.get(name):0;
				
				confCount.put(name,  count+1);
				
			}
			fileReader.close();
			System.out.println("Contents of file:");
			System.out.println(stringBuffer.toString());
			confCount.forEach((k,v)->{
				System.out.println(k+":"+v);
			});
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}