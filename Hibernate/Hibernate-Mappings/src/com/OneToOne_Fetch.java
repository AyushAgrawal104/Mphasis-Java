package com;

import javax.swing.plaf.synth.SynthScrollBarUI;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.onetoone.Department;
import com.onetoone.Employee;

public class OneToOne_Fetch {

	public static void main(String[] args) {

		Configuration cf = new Configuration().configure();

		StandardServiceRegistryBuilder srb = new StandardServiceRegistryBuilder();
		srb.applySettings(cf.getProperties());
		ServiceRegistry sr = srb.build();
		SessionFactory sf = cf.buildSessionFactory(sr);

		Session ses = sf.openSession();

		
		Employee emp= (Employee) ses.get(Employee.class, 1025);
		
		System.out.println("Id: "+emp.getEmpId());
		System.out.println("Name: "+emp.getEmpName());
		System.out.println("Salary: "+emp.getSalary());
		
		System.out.println("Dept Id: "+emp.getDept().getDeptId());
		System.out.println("Dept Name: "+emp.getDept().getDeptName());
		
		
		
		

		System.out.println("--- Done ---");

	}

}
