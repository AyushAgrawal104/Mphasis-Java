package com;

import java.io.File;

public class FileDemo {
	
	public static void main(String[] args) {
		
		try {
			
			File file=new File("D:/files/f1/f2/f3/f4/one.txt");
			System.out.println(file.isDirectory());
			System.out.println(file.isFile());
			System.out.println(file.isHidden());
			System.out.println(file.isAbsolute());
			
		   //  file.mkdirs();
		     file.createNewFile();
		
			
			
		} catch (Exception e) {
			System.out.println("Faile due to "+e);
		}
		
		
	}
	

}
