package com.linkedlist;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
			
		Scanner scanner = new Scanner(System.in);
		//String input = scanner.nextLine();
		int n=0;
		
		MyLinkList head=null;
		
		
		while(n!=6) {
			
			System.out.println("*******************");
			System.out.println("1. Add");
			System.out.println("2. Remove first");
			System.out.println("3. Remove last");
			System.out.println("4. Print");
			System.out.println("5. Exit" );
			System.out.println("Enter Choice:");
			n = scanner.nextInt();
			
			
			switch(n) {
			
			case 1: 
				System.out.println("Enter number");
				int anyNumber = scanner.nextInt();
				if(head==null) {
					head= new MyLinkList(anyNumber, null);
				}else {
					Add(head, anyNumber);
				}
				break;
			
			case 2:
				
				
				head = DeleteFirst(head);
				break;
			
			case 3:
				DeleteLast(head);
				break;
			
			case 4: 
				MyLinkList t = head;
				System.out.println();
				while(t !=null) {
					System.out.print(t.number+" ");
					t=t.next;
				}
				System.out.println();
				break;
			default:
				System.out.println("Careful !!! wrong choice!!!");
			}
			
		}
		
		
	}
	
	public static void Add(MyLinkList l, int n) {
		while(l.next!=null) {
			l=l.next;
		}
		MyLinkList node = new MyLinkList(n, null);
		
		l.next = node;
	}
	
	
	public static MyLinkList DeleteFirst(MyLinkList l) {
		if(l==null) {
			System.out.println("no element");
			return l;
		}
		return l.next;
	}
	
	public static void DeleteLast(MyLinkList l) {
		
		if(l==null) {
			System.out.println("no element");
			return;
		}
		
		MyLinkList previous = null;
		
		while(l.next!=null) {
			previous=l;
			l=l.next;
		}
		
		previous.next=null;
		
	}

}
