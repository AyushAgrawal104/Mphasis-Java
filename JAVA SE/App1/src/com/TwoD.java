package com;

public class TwoD {
	
	public static void main(String[] args) {
		
		
		int[][] x= {{1,2,3},{4,5,6}};
		
		//int n[][]=new int[10][5];
		//int [][]n=new int[10][5];
		 int[][] n=new int[10][5];
		 //int[][] n1=new int[10][5];
		
		for(int rows=0;rows<x.length;rows++) {
			
			for(int cols=0;cols<x[rows].length;cols++) {
				System.out.print(x[rows][cols]+" ");
				
			}
			
			System.out.println();
		}
		
		System.out.println("-----------------------------------");
		
		
		for(int rows[]:x) {
			
			for(int cols:rows) {
				System.out.print(cols+" ");
			}
			System.out.println();
		}
		
		
		
	}

}
