package com;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test {

	public static void main(String[] args) {

		boolean flag = true;

		while (flag == true) {
			try {

				InputStreamReader isr = new InputStreamReader(System.in);
				BufferedReader br = new BufferedReader(isr);

				System.out.println("Enter a No: ");
				int n = Integer.parseInt(br.readLine());
				System.out.println("You Have entered: " + n);
				flag=false;
			} catch (Exception e) {

				System.out.println("Invalid Input. try again");
			}
		} // end of while

	}
}
