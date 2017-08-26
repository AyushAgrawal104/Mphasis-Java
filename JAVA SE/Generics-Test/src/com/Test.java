package com;

public class Test<E1, E2> {

	void swap(E1 a, E2 b) {

		Object t;

		System.out.println("Before Swap: A= " + a + " and B= " + b);
		t =  a;
		a = (E1) b;
		b = (E2) t;

		System.out.println("After Swap: A= " + a + " and B= " + b);

	}

	/*
	 * void f1(int x) {
	 * 
	 * }
	 * 
	 * void f1(float x) {
	 * 
	 * }
	 * 
	 * void f1(String x) {
	 * 
	 * }
	 */
	public static void main(String[] args) {

		Test<Integer, Integer> t1 = new Test<>();

		t1.swap(100, 34);
		// t1.swap("Abc","Xyz");
		// t1.swap(45.45f,34.445f);

	}

}
