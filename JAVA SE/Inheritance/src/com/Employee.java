package com;

public class Employee {

	private String empName;
	private String empType;
	private double salary;
	private int noOfDays;
	private int noofHours;

	public int getNoOfDays() {
		return noOfDays;
	}

	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}

	public int getNoofHours() {
		return noofHours;
	}

	public void setNoofHours(int noofHours) {
		this.noofHours = noofHours;
	}

	public String getEmpType() {
		return empType;
	}

	public void setEmpType(String empType) {
		this.empType = empType;
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

	public void computeSalary() {

	}

	public void display() {
		System.out.println("Employee Name: " + empName);
		System.out.println("Employee Type: " + empType);
		System.out.println("Salary: " + salary);
		System.out.println("----------------------------------");
	}

}
