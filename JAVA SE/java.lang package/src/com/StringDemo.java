package com;

public class StringDemo {

	/*
	 * 1. Simple Clases --> String, all waraper classes 2. Complex classes --> Emp,
	 * Sample
	 * 
	 * 
	 */

	public static void main(String[] args) {

		String s1 = "A";
		String s2 = new String("A");

		System.out.println("S1: " + s1);
		System.out.println("Hash Code S1: " + System.identityHashCode(s1));

		System.out.println("S2: " + s2);
		System.out.println("Hash Code S2: " + System.identityHashCode(s2));

		if (s1.equals(s2)) {
			System.out.println("Equal");
		} else {
			System.out.println("Not Equal");
		}

		/*
		 * System.out.println("S2: " + s2); System.out.println("Hash Code: " +
		 * s2.hashCode());
		 */

	}

}
