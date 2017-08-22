package com;

import java.util.Scanner;

public class Search {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num[] = new int[5];
		System.out.println("Enter 5 Nos: ");

		for (int i = 0; i < num.length; i++)
			num[i] = sc.nextInt();

		System.out.println("Values of Array ");
		for (int n : num) {
			System.out.print(n + "  ");
		}

		System.out.println("Enter a No to Search: ");

		int key = sc.nextInt();

		boolean flag = false;

		int index=0;
		
		for(int i=0;i<num.length;i++) {
			if(num[i]==key) {
				index=i;
				flag=true;
				break;
			}
		}
		
		if(flag) {
			System.out.println(key+" Found at "+index);
			
		}else {
			System.out.println(key+" Not Found");
		}
		/*for (int n : num) {
			if (n == key) {
				flag = true;
			}

		} // end of loop

		if (flag == true) {
			System.out.println("Found");

		} else {
			System.out.println("Not Found");
		}
*/
	}
}
