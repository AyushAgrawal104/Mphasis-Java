package com;

import java.io.FileReader;

public class ReaderDemo {
	
	public static void main(String[] args) {
		
		
		try {
			
			FileReader fr=new FileReader("D:/files/one.txt");
			
			int i;
			while((i=fr.read())!=-1) {
				
				System.out.print((char)i);
			}
			
			fr.close();
			
			
		} catch (Exception e) {
			System.out.println("-- Failed due to "+e);
		}
		
		
		
	}

}
