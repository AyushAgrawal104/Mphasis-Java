package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.manytoone.Department;
import com.manytoone.Employee;

public class ManyToOne_Save {

	public static void main(String[] args) {

		Configuration cf = new Configuration().configure();

		StandardServiceRegistryBuilder srb = new StandardServiceRegistryBuilder();
		srb.applySettings(cf.getProperties());
		ServiceRegistry sr = srb.build();
		SessionFactory sf = cf.buildSessionFactory(sr);

		Session ses = sf.openSession();

		Department dept1 = new Department();
		dept1.setDeptId(10);
		dept1.setDeptName("HR");

		Department dept2 = new Department();
		dept2.setDeptId(11);
		dept2.setDeptName("Accounts");

		Employee e1 = new Employee(1024, "Praveen", 34864);
		Employee e2 = new Employee(1025, "Bucky", 367747);
		Employee e3 = new Employee(1026, "James", 76899);
		Employee e4 = new Employee(1027, "Ella", 8686);
		Employee e5 = new Employee(1028, "Ruth", 978686);

		e1.setDept(dept1);
		e2.setDept(dept1);
		e3.setDept(dept1);

		e4.setDept(dept2);
		e5.setDept(dept2);

		ses.save(e1);
		ses.save(e2);
		ses.save(e3);
		ses.save(e4);
		ses.save(e5);

		ses.beginTransaction().commit();

		System.out.println("--- Done ---");

	}

}
