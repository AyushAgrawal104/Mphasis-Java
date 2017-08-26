package com;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerDemo {

	public static void main(String[] args) {

		Employee emp = new Employee();
		emp.setEmpId(12);
		emp.setEmpName("James");
		emp.setSalary(847384);
		emp.setInfo("Info about Employee");

		try {
			FileOutputStream fos = new FileOutputStream("D:/files/emp.txt");

			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(emp);
			System.out.println("--- Writing is done");

		} catch (Exception e) {
			System.out.println("--- Failed due to " + e);
		}

	}

}
