package com;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a No: ");
		int x=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter a String: ");
		String s1=sc.nextLine();
		
		System.out.println("String: "+s1);
		System.out.println("Number: "+x);
		
		
	}
}
