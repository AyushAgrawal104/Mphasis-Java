package com;

import java.util.Scanner;

class Test {
	public Test() {
		System.out.println("-- Test class Object Created");
	}

	void f1() {
		System.out.println("-- f1 method of Test class");
	}
}

class Sample {

	public Sample() {
		System.out.println("-- Sample class Object Craeted");
	}

	void f2() {
		System.out.println("-- f2 method of Sample class");
	}
}

public class Demo {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Class");
		String clsName = sc.next();

		Class cl = Class.forName(clsName);
		Object obj=  cl.newInstance();
		
		
		if(obj instanceof Test) {
			Test t=(Test) obj;
			t.f1();
		}
		if(obj instanceof Sample) {
			Sample s=(Sample) obj;
			s.f2();
		}
			

	}

}
