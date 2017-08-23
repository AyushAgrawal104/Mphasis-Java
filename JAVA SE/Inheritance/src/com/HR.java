package com;

public class HR {
	
	public static void main(String[] args) {
		
		Employee emp=new SalariedEmployee();
		emp.setEmpName("James");
		emp.setEmpType("Salaried");
		emp.setNoOfDays(22);
		
		emp.computeSalary();
		emp.display();
		
		emp=new ContractEmployee();
		emp.setEmpName("Praveen");
		emp.setEmpType("Contract");
		emp.setNoofHours(500);
		
		emp.computeSalary();
		emp.display();
		
		
		
	}

}
