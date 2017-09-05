package com;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class Test {

	public static void main(String[] args) {

		Configuration cf = new Configuration();
		cf.configure();

		StandardServiceRegistryBuilder srb = new StandardServiceRegistryBuilder();
        srb.applySettings(cf.getProperties());
        ServiceRegistry sr = srb.build();
        SessionFactory sf = cf.buildSessionFactory(sr);

		Session ses = sf.openSession();
		Session ses1 = sf.openSession();
		Transaction tx = ses.beginTransaction();
		Transaction tx1 = ses1.beginTransaction();

		Employee emp = new Employee();
		emp.setEmpId(11);
		emp.setEmpName("Ozvitha");
		emp.setSalary(97566);
		emp.setDob(new Date("19/8/12"));
		emp.setHno("16/A1");
		emp.setCity("Hyderabad");
		emp.setStreet("Madhapur");
		emp.setProjId("P001");
		emp.setProjName("JP");
		
		/*
		Employee emp1 = new Employee();
		emp1.setEmpId(11);
		emp1.setEmpName("James");
		emp1.setSalary(845975);*/

		ses.save(emp);
		//ses.save(emp1);
		
		
		tx.commit();

		System.out.println("--- Done ---");

	}

}
