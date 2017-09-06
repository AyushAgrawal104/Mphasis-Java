package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.onetoone.Department;
import com.onetoone.Employee;

public class OneToOne_Save {

	public static void main(String[] args) {

		Configuration cf = new Configuration().configure();

		StandardServiceRegistryBuilder srb = new StandardServiceRegistryBuilder();
		srb.applySettings(cf.getProperties());
		ServiceRegistry sr = srb.build();
		SessionFactory sf = cf.buildSessionFactory(sr);

		Session ses = sf.openSession();

		Department dept = new Department();
		dept.setDeptId(10);
		dept.setDeptName("HR");

		Employee emp = new Employee();
		emp.setEmpId(1024);
		emp.setEmpName("James");
		emp.setSalary(843856);
		
		Employee emp1 = new Employee();
		emp1.setEmpId(1025);
		emp1.setEmpName("Praveen");
		emp1.setSalary(4344);

		emp.setDept(dept);
		emp1.setDept(dept);

		ses.save(emp);
		ses.save(emp1);
		
		

		ses.beginTransaction().commit();

		System.out.println("--- Done ---");

	}

}
