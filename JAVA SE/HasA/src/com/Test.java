package com;

public class Test {

	public static void main(String[] args) {
		
		Department dept=new  Department();
		dept.setDeptId(102);
		dept.setDeptName("HR");
		
		Employee emp=new Employee();
		emp.setEmpId(10);
		emp.setEmpName("Praveen");
		emp.setSalary(384738);
		emp.setDept(dept);
		
		emp.display();
		
		

	}
}
