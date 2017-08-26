package com;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeSerDemo {
	
	public static void main(String[] args) {
		
		
		try {
			
			FileInputStream fis=new FileInputStream("d:/files/emp.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);
			
			Employee e1= (Employee) ois.readObject();
			
			System.out.println("EmpId: "+e1.getEmpId());
			System.out.println("Name: "+e1.getEmpName());
			System.out.println("Salary: "+e1.getSalary());
			System.out.println("Info: "+e1.getInfo());
			long l=10;
			System.out.println(Long.MAX_VALUE);
			
			
			ois.close();
			
			
		} catch (Exception e) {
			System.out.println("-- failed due to "+e);
		}
		
	}

}
