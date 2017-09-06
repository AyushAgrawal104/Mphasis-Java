package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.onetomany.Department;
import com.onetomany.Employee;

public class OneToMany_Fetch {

	public static void main(String[] args) {

		Configuration cf = new Configuration().configure();

		StandardServiceRegistryBuilder srb = new StandardServiceRegistryBuilder();
		srb.applySettings(cf.getProperties());
		ServiceRegistry sr = srb.build();
		SessionFactory sf = cf.buildSessionFactory(sr);

		Session ses = sf.openSession();

		Department dept = (Department) ses.get(Department.class, 11);
		System.out.println("Dept Id: " + dept.getDeptId());
		System.out.println("Dept Name: " + dept.getDeptName());
		
		for(Employee emp:dept.getEmps()) {
			System.out.println("Id: "+emp.getEmpId());
			System.out.println("Name: "+emp.getEmpName());
			System.out.println("Salary: "+emp.getSalary());
			System.out.println("-----------------------------");
			
		}
		

	}

}
