package com;

public abstract class Shape {
	
	public Shape() {
	System.out.println("-- Shape class Object Created");
	}
	
	abstract void draw();
	abstract void design();
	/*abstract void f2();
	abstract void f3();*/
	
	void f1() {
		System.out.println("--- f1 method of Shape class");
	}

}
