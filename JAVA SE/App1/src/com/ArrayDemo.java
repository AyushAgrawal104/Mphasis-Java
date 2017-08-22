package com;

public class ArrayDemo {
	
	public static void main(String[] args) {
		
		/*
		 * Notes
		 * -----------
		 * 
		 * --> 1. default values
		 * --> 2. with size declaration
		 * 
		 */
		
		// 1. with Default
		
		int[] x= {1,2,3,4};
		//System.out.println(x[0]);
		// with for loop
		/*
		for(int i=0;i<x.length;i++) {
			System.out.println("X["+i+"]="+x[i]);
		}
		*/
		
		// with size declaration
		final int MAX_VAL=20;
		
		int y[]=new int[MAX_VAL]; // with size
		
		//int n[]=new int[10];
		//int []n=new int[10];
		
		 int[] n=new int[10];
		
		y[0]=10;
		y[1]=20;
		
		for(int i=0;i<y.length;i++) {
			System.out.println("y["+i+"]="+y[i]);
		}
		
		
		
		
		
		
	}

}
