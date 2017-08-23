package com;

class T1 {

	public T1() {
		System.out.println("--- T1 class Default constructor");
	}

	public T1(int x) {

		System.out.println("--- T1 class Parametarized " + x);
	}

}

public class T2 extends T1 {

	public T2() {
		super(76);
		System.out.println("--- T2 class Default constructor");

	}

	public T2(int x) {
		    super(34);
			System.out.println("--- T2 class parametarized constructor " + x);

		}

	public static void main(String[] args) {

		//T2 t2 = new T2();
	   T2 t3 = new T2(45);

	}

}
