package com;

public class Circle extends Shape{
	
	public Circle() {
	
		System.out.println("-- Circle class Object");
	}

	@Override
	void draw() {
		System.out.println("--- Drawing Circle");
		
	}

	@Override
	void design() {
		System.out.println("--- Designing Circle Shape");
		
	}


	
	
}
