package com.enum1.practice;

public class Fibbonaci1 {

	public static void main(String[] args) {
		int n=8;
		
		//fibonnaci(n);
		
		fibonnaciR(n);
		
	}

	private static int fibonnaciR(int n) {
		if(n==0 || n==1) {
			return n;
		}
		
		return fibonnaciR(n-1)+fibonnaciR(n-2);
		
	}

	private static void fibonnaci(int n) {
		
		int f1=0,f2=1,f=1, count=1;
		System.out.print(f1+" ");
		while(count<n) {
			System.out.print(f+" ");
			f=f1+f2;
			f1=f2;
			f2=f;
			
			count++;
			
			
			
		}
		
		
		
	}

}
