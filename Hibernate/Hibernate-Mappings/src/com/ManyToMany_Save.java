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

public class ManyToMany_Save {

	public static void main(String[] args) {

		Configuration cf = new Configuration().configure();

		StandardServiceRegistryBuilder srb = new StandardServiceRegistryBuilder();
		srb.applySettings(cf.getProperties());
		ServiceRegistry sr = srb.build();
		SessionFactory sf = cf.buildSessionFactory(sr);

		Session ses = sf.openSession();

		Course c1 = new Course(10, "Java", 6553);
		Course c2 = new Course(11, "CPP", 95);
		Course c3 = new Course(12, "PHP:", 200);

		Student s1 = new Student(1024, "Praveen");
		Student s2 = new Student(1025, "James");
		Student s3 = new Student(1026, "Teja");

		s1.getCourses().add(c1);
		s1.getCourses().add(c2);
		s1.getCourses().add(c3);

		s2.getCourses().add(c1);
		s2.getCourses().add(c3);

		s3.getCourses().add(c1);

		ses.save(s1);
		ses.save(s2);
		ses.save(s3);

		ses.beginTransaction().commit();

		System.out.println("--- Done ---");

	}

}
