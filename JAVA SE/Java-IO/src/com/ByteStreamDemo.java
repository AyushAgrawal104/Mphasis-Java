package com;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class ByteStreamDemo {

	public static void main(String[] args) {

		try {

			FileOutputStream fos = new FileOutputStream("D:/mphsis.txt");
			
			
			String s1 = "This is a test";

			char ch[] = s1.toCharArray();

			// byte data[] = s1.getBytes();

			// fos.write(data);
			
			

			for (int i = 0; i < ch.length; i++) {
				int data = ch[i];
				/*if(ch[i]=='a')
					continue;*/
				fos.write(data);
			}

			fos.close();
			System.out.println("--- Writing is done");

		} catch (Exception e) {
			System.out.println("--- Failed dueu to " + e);
		}

	}

}
