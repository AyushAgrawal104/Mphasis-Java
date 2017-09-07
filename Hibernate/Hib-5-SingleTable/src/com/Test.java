package com;

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
		Transaction tx = ses.beginTransaction();

		Employee emp = new Employee();
		emp.setEmpId(11);
		emp.setEmpName("Ozvitha");
		emp.setSalary(97566);
		
		Address addr=new Address();
		addr.setAddrId(1);
		addr.setCity("Hyderabad");
		addr.setHno("#86/23");
		

		emp.setAddr(addr);
		
		
		
		ses.save(emp);

		tx.commit();

		System.out.println("--- Done ---");

	}

}
