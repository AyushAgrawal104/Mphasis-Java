package com;

public class ContractEmployee extends Employee{



	@Override
	public void computeSalary() {
		
		setSalary(getNoofHours()*2000);	
		
	}
	

	
}
