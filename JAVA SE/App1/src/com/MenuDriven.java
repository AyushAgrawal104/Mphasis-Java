package com;

import java.util.Scanner;

public class MenuDriven {

	public static void main(String[] args) {

		int ch;
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("MENU");
			System.out.println("-----");
			System.out.println("1. Add");
			System.out.println("2. Disp");
			System.out.println("3. Search");
			System.out.println("4. Modify");
			System.out.println("5. Delete");
			System.out.println("6. Exit");
			System.out.println("Enter your Choice: ");
			ch = sc.nextInt();

			switch (ch) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				System.out.println("Thank you. Visist again");
				System.exit(1);
			default:
				System.out.println("Invalid Input. Try again");
			}

		}

	}
}
