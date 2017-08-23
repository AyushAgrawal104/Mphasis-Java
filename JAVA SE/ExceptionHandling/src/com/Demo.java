package com;

public class Demo {

	public static void main(String[] args) {

		try {

			int x = 10;
			int y = 10;
			// int z = x / y;
			int i[] = new int[1];

			i[0] = x / y;

			System.out.println("--- ");

		} catch (ArithmeticException e) {
			System.out.println("Failed due to " + e);
		} 
		catch (ArrayIndexOutOfBoundsException ae) {
			System.out.println("Failed due to " + ae);
		} 
		catch (Exception ee) {

		} 
		finally {
			System.out.println("--- always executes");
			System.out.println("--- Closing all things");
		}

		

	}

}
