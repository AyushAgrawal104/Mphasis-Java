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

		/*
		 * Employee emp=new Employee();
		 * 
		 * emp.setEmpId(1); emp.setEmpName("James"); emp.setSalary(3863484);
		 * 
		 * 
		 * ses.saveOrUpdate(emp);
		 */

		Employee emp = (Employee) ses.get(Employee.class, 5);

		emp.setEmpName("Praveen Reddy S");
		// emp.setSalary(86565);
		ses.update(emp);
		
		ses.close();
		ses=sf.openSession();
		ses.merge(emp);
		
		
		ses.beginTransaction().commit();

		System.out.println("--- Done ---");

	}

}
