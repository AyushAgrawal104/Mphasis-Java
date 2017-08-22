package com;

class Test {

	int num;

	void setNo(Test testObj) {// formal argument {
		System.out.println("Before Change: " + testObj.num);
		testObj.num = 2000;

	}

	void d1(int x) {
		System.out.println("Before Modifecation X= " + x);
		x = 200;

	}

	void display() {
		System.out.println("Num: " + num);
	}

}

public class CallByDemo {

	public static void main(String[] args) {

		Test t = new Test();
		t.num = 1000;
		//t.setNo(t);// Actuval argument
		//System.out.println("After Modifecation");
		//t.display();
		int x = 100; // local variable
		t.d1(x);
		System.out.println("After Modifecation");
		System.out.println("X= " + x);

	}

}
