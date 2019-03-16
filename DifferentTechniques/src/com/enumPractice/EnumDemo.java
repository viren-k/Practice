package com.enumPractice;

public class EnumDemo {

	public static void main(String[] args) {
		Client client = Client.ACCOUNT;
		
		client.a=5;
		client.b =10;
		
		Client.b=13;
		
		//client.PrintValue();
		System.out.println(client);
		
		client.setValue(5, 66);
		
		//client.PrintValue();
		
		
		Client secondClient = Client.ACCOUNT;
		
		secondClient.PrintValue();
		System.out.println(secondClient);
		
	}

}
