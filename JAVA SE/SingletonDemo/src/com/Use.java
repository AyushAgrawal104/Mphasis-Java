package com;

public class Use {
	
	public static void main(String[] args) {
		
	
		//Employee e1=new Employee();
		//Employee e2=new Employee();
		Employee e1= Employee.getObject();
		Employee e2= Employee.getObject();
		
		e1.test();
		e2.test();
		
		
	}

}
