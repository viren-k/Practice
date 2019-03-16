package com.vk.practice;

import java.util.HashMap;
import java.util.Map;

public class Lallan {

	public static void main(String[] args) {

		//ReplaceSpaceWith();
		//StringCompression16();
		//Lalln2();
		
		//System.out.println(128>>4);
		
		//
		
		
		//after
		
//		int[] old= {3,5,7,9};
//		int[] newa = {2,4,6,8,9,5,3,5};
//		System.arraycopy(old,  0, newa,  0,  old.length);
//		
//		System.out.println("HI");
		
		
//		String a = "a";
//		
//		switch(a) {
//		
//		case "a": System.out.println("aa");
//		case "b": System.out.println("bb");
//		default:
//			System.out.println("cc");
		
//		}
		
		
		
		lallan9();
		
	}

	private static void lallan9() {
		Map<Parent, String> myMap = new HashMap<Parent, String>();
		Parent p1 = new Parent("a",1);
		Parent p2 = new Parent("a",1);
		
		p1=p2;
		
		myMap.put(p1, "hello");
		myMap.put(p2, "raja");
		
		int b = p1.hashCode();
		
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		
		System.out.println(p1.equals(p2));
		
		myMap.forEach((k,v)->{
			System.out.println(k);
			System.out.println(v);
			
		});
		
	}

	private static void lallan8() {
		{
			float a = 2000000000;
			float b =(float) 2000000000.0;
			String s = null;
			
			
			System.out.println(s);
			
			if(a==b) {
				System.out.println("equal");
			}else {
				System.out.println("not equal");
			}
			
		}
		//System.out.println(a);
		
		
	}

	private static void changeValue(int[] abc) {
		int temp=abc[2];
		abc[2]=abc[3];
		abc[3]=temp;
		//abc.length
	}

	private static void Lalln2() {
		int[] arr = {1,2,3,4};
		System.out.println("FreeMomory:"+Runtime.getRuntime().freeMemory());
		System.out.println(Runtime.getRuntime().availableProcessors());
		System.out.println(Runtime.getRuntime());
		change(arr);
		System.out.println(arr[1]);
		
		
	}

	private static void change(int[] arr) {
		arr[1]=7;
	}

	private static void StringCompression16() {
		String str1="aabcccdd";
		int a = 10;
		char[] charArray = str1.toCharArray();
		StringBuilder sb = new StringBuilder();
		
		int count=1;
		int i=0;
		int flag=1;
		
		while(i<str1.length()-1) {
			flag=1;
			while(charArray[i]==charArray[i+1] && i<str1.length()-1) {
				count++;
				i++;
				
			}
			if(i<str1.length()-1) {
				sb.append(charArray[i]).append(count);
				count=1;
				i++;
				flag=0;
			}
		}
		if(flag==0) {
			i--;
		}
		if(charArray[i]==charArray[i+1]) {
			sb.append(charArray[i]).append(++count);
		}else {
			sb.append(charArray[i+1]).append("1");
		}
			
		
		System.out.println(sb.toString());
		
	}

	private static void ReplaceSpaceWith() {
		String str= "Hi how are you";
		int n = str.length();
		int noOfSpaces=0;
		
		for(int i=0;i<n;i++) {
			if(str.charAt(i)==' ') {
				noOfSpaces++;
			}
		}
		
		char[] charStr = new char[str.length()+2*noOfSpaces];
		
		
		System.out.println("Length is:"+n);
	
		
		
		int j=n-1;
		for(int i=n+noOfSpaces*2-1; i>=0;) {
			if(str.charAt(j)!=' ') {
				charStr[i--]=str.charAt(j--);
			}else {
				charStr[i--]='0';
				charStr[i--]='2';
				charStr[i--]='%';
				j--;
			}
		}
		System.out.println("Resultant String:"+charStr.toString());
		
		
		
	}

}
