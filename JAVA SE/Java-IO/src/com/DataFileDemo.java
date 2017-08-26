package com;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DataFileDemo {

	public static void main(String[] args) {

		try {
			
			 

			InputStreamReader isr = new InputStreamReader(System.in);

			BufferedReader br = new BufferedReader(isr);

			System.out.println("ENter a No: ");
			int n1 = Integer.parseInt(br.readLine());
			System.out.println("Enter another a No: ");
			int n2 = Integer.parseInt(br.readLine());

			System.out.println("Enter a char: ");
			char ch = (char) br.read();

			System.out.println("-- Char: " + ch);
			System.out.println("Sum is " + (n1 + n2));

		} catch (Exception e) {
			System.out.println("--  Failed due to " + e);
		}

	}

}
