package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class SortBySalary implements Comparator<Employee>{
	@Override
	public int compare(Employee emp1, Employee emp2) {
		// TODO Auto-generated method stub
		return (int) (emp1.getSalary()-emp2.getSalary());
	}
}
public class Use {

	public static void main(String[] args) {

		Employee e1 = new Employee(26, "Khg", 25000);
		Employee e2 = new Employee(15, "Dgf", 15000);
		Employee e3 = new Employee(23, "Lhg", 12000);
		Employee e4 = new Employee(12, "Ahg", 35000);
		Employee e5 = new Employee(21, "Jhg", 11000);

		ArrayList<Employee> emps = new ArrayList<>();
		emps.add(e1);
		emps.add(e2);
		emps.add(e3);
		emps.add(e4);
		emps.add(e5);
		
		
		
		System.out.println("--- Original Data ---");
		Employee.display_V1(emps);
		System.out.println("--- Sorting on Emp Ids ---");
		Collections.sort(emps);
		Employee.display_V1(emps);
		
		System.out.println("--- Sorting on Emp Names ---");
		Collections.sort(emps,new Employee());
		Employee.display_V1(emps);
		
		
		System.out.println("--- Sorting on Emp Salary ---");
		Collections.sort(emps,new SortBySalary());
		Employee.display_V1(emps);
		
	}

}
