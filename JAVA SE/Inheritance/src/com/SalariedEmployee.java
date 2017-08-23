package com;

public class SalariedEmployee extends Employee {

	@Override
	public void computeSalary() {
		setSalary(getNoOfDays()*2500);		
	}

}
