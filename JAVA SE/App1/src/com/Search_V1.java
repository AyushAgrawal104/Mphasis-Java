package com;

import java.util.Scanner;

public class Search_V1 {

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
		int l=0;
		int j=0;
		int count=0;
		int found;
		/*for(int i=0;i<num.length;i++) {
			if(num[i]==key) {
				index=i;
				rep[j++]=num[i];
				loc[l++]=i;
				flag=true;

			}
		}*/
		
		
		
		for(int i=0;i<num.length;i++) {
			if(num[i]==key) {
				count++;
				found=num[i];
				flag=true;
				index=i;
			}
		}
		
		int rep[]= {};
		int loc[]= {};
		
		if(count>=2) {
		rep=new int[count];
		loc=new int[count];
		}
		
		
		
		if(count>=2) {
		for(int i=0;i<num.length;i++) {
			if(num[i]==key) {
				index=i;
				rep[j++]=num[i];
				loc[l++]=i;
				flag=true;

			}
		}
	}// end of if
		
		
		if(flag && count>=2) {
			System.out.println("Found: "+rep.length+" Numbers");
			for(int k=0;k<rep.length;k++) {
				System.out.println(rep[k]+" is  at "+loc[k]+" location");
			}
			
		}else if(flag) {
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
