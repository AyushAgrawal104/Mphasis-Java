package com;

public class Employee {

	private static Employee emp = null;

	private Employee() {
		System.out.println("--- Employee Object created " + this.hashCode());
	}

	public static Employee getObject() {

		if(emp==null) {
		 emp = new Employee();
		}

		return emp;

	}

	public void test() {
		System.out.println("-- testing employee");
	}
	
	
	
	
	
	
	
	
	
	

}
