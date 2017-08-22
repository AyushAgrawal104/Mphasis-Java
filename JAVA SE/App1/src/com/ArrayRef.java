package com;

class A {

	void test(int[] temp) {
		temp[0]=100;
		
	}
	
}

public class ArrayRef {

	public static void main(String[] args) {
		A a = new A();

		int x[] = { 1, 2, 3 };

		for (int i : x) {
			System.out.println(i);
		}
		
		a.test(x);
		System.out.println("------------------------");
		
		for (int i : x) {
			System.out.println(i);
		}
		
		
	}

}
