package com;

class A {

	void f1() {
		System.out.println("----- A class f1 method");
	}

}

public class B extends A {

	void f1() {
		System.out.println("----- B class f1 method");
	}

	public static void main(String[] args) {

		B b=new B ();
		b.f1();
	
	
	}

}
