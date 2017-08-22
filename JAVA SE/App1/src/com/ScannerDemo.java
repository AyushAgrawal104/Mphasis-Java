package com;

import java.util.Scanner;

public class ScannerDemo {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in); // System.in represents keyboard
		
		System.out.println("Enter a No: ");
		int n=sc.nextInt(); // scanf
		System.out.println("Enter a float value: ");
		float f=sc.nextFloat();
		System.out.println("Enter a Double  Value");
		double d=sc.nextDouble();
		
		System.out.println("Int: "+n);
		System.out.println(f);
		System.out.println(d);
		
		
		
	}
	

}
