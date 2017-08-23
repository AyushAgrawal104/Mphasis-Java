package com;

public class Circle extends Shape{

	@Override
	void draw() {
		
		System.out.println("--- Drawing Circle");
		super.draw();
		
	}
	
	void circleInfo() {
		System.out.println("-- Information about the circle");
	}
	
	
	
}
