package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class Test {

	public static void main(String[] args) {

		Configuration cf = new Configuration().configure();
		

		 StandardServiceRegistryBuilder srb = new StandardServiceRegistryBuilder();
		srb.applySettings(cf.getProperties());
		ServiceRegistry sr = srb.build();
		SessionFactory sf = cf.buildSessionFactory(sr);

		Session ses = sf.openSession();

		
		
		Employee emp=   (Employee) ses.load(Employee.class, 12);
	/*	
		emp.setEmpName("Sathi");
		emp.setSalary(6555);
		ses.update(emp);*/
		
		ses.delete(emp);
		
		ses.beginTransaction().commit();
		
		//System.out.println("Emp Id: "+emp.getEmpId());
	/*	System.out.println("Name; "+emp.getEmpName());
		System.out.println("Salary: "+emp.getSalary());
		System.out.println("------------------------------------");*/
		
		
		System.out.println("--- Done ---");
		sf.close();
		

	}

}
