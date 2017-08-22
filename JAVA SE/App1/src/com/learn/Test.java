package com.learn;

import com.Employee;

public class Test {

	public static void main(String[] args) {

		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();

		e1.setEmpId(1024);
		e1.setEmpName("Praveen");
		e1.setSalary(84683);

		e2.setEmpId(1025);
		e2.setEmpName("Ozvitha");
		e2.setSalary(384684);

		System.out.println("EMp Id : " + e1.getEmpId());
		System.out.println("Name: " + e1.getEmpName());
		System.out.println("Salary: " + e1.getSalary());

		System.out.println("---------------------------------");

		System.out.println("EMp Id : " + e2.getEmpId());
		System.out.println("Name: " + e2.getEmpName());
		System.out.println("Salary: " + e2.getSalary());

	}

}
