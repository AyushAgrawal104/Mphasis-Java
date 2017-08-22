package com;

public class Test {
	void m1() {

	}

	/*void m1(int x) {

		System.out.println("Int X: " + x);
	}

	void m1(short x) {
		System.out.println("Short X: " + x);

	}

	void m1(long x) {

		System.out.println("Long X: " + x);
	}
*/
	/*void m1(byte x) {
		System.out.println("Byte X: " + x);

	}*/
	

	void m1(double x) {
		System.out.println("Double X: " + x);
	}

	/*void m1(float x) {
		System.out.println("FLoat X: " + x);
	}
*/
	void m1(int x, float y) {
		System.out.println(("int and float"));
	}
	
/*	void m1(int x, int y) {
		System.out.println(("int and int"));
	}*/

	/*void m1(long x, long y) {
		System.out.println(("long  and long"));
	}*/
	void m1(double x, double y) {
		System.out.println(("double  and double"));
	}
	
	void m1(int x, long y) {
		System.out.println(("int and float"));
	}
	void m1(int x, double y) {
		System.out.println(("int and double"));
	}

	void m1(float y, int x) {

	}

	public static void main(String[] args) {

		Test t = new Test();

		//t.m1(23); // int
		//t.m1(23); // Long
		//t.m1((byte)23);
		
		t.m1(122L,54L);
		
	}

}
