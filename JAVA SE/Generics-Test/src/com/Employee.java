package com;

import java.util.Comparator;
import java.util.List;

public class Employee implements Comparable<Employee>, Comparator<Employee> {

	private int empId;
	private String empName;
	private double salary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compareTo(Employee emp) {

		return empId - emp.getEmpId();
	}

	@Override
	public int compare(Employee emp1, Employee emp2) {

		return emp1.getEmpName().compareTo(emp2.getEmpName());
	}

	public Employee(int empId, String empName, double salary) {
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public static void display_V1(List<Employee> emps) {
		System.out.println("Id\tName\tSalary");
		System.out.println("-------------------------------------");
		for (Employee emp : emps) {
			System.out.println(emp.getEmpId() + "\t" + emp.getEmpName() + "\t" + emp.getSalary());
			// System.out.println();
		}
	}

	public void display() {
		System.out.println("Employee Id: " + empId);
		System.out.println("Name: " + empName);
		System.out.println("Salary: " + salary);
		System.out.println("-----------------------------");
	}

}
