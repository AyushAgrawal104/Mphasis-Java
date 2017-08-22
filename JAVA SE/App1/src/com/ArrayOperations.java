package com;

public class ArrayOperations {

	public static void main(String[] args) {
		
		int x[]= {1,2,3,4,5,6};
		String[] cities= {"CHN","Bang","HYD"};
		
	/*	for(int i=0;i<x.length;i++) {
			System.out.println(x[i]);
			
		}
		System.out.println("---------------------------");
		
		for(int i=x.length-1;i>=0;i--) {
			System.out.println(x[i]);
		}
		*/
		
		// For Each ---> Arrays
		
		
		for(int i:x) {
			System.out.println(i);
		}
		
		for(String city:cities) {
			System.out.println(city);
		}
		
		
		
		
		
	}
	
	
}
