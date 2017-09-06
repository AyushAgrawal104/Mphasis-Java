package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.manytomany.Course;
import com.manytomany.Student;
import com.manytoone.Department;
import com.manytoone.Employee;

public class ManyToMany_Fetch {

	public static void main(String[] args) {

		Configuration cf = new Configuration().configure();

		StandardServiceRegistryBuilder srb = new StandardServiceRegistryBuilder();
		srb.applySettings(cf.getProperties());
		ServiceRegistry sr = srb.build();
		SessionFactory sf = cf.buildSessionFactory(sr);

		Session ses = sf.openSession();

		Student std = (Student) ses.get(Student.class, 1025);

		System.out.println("Std id: " + std.getStdId());
		System.out.println("Name: " + std.getStdName());

		for (Course c : std.getCourses()) {
			System.out.println("Cours Id: " + c.getCourseId());
			System.out.println("Course Name: " + c.getCourseName());
			System.out.println("Price: " + c.getPrice());
			System.out.println("--------------------------------");

		}

		System.out.println("--- Done ---");

	}

}
