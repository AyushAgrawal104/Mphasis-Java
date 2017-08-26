package com;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class InputStreamDemo {

	public static void main(String[] args) {

		
		FileInputStream fis=null;
		try {

			File fileLoc = new File("D:/mphasis.txt");
			//System.out.println(fileLoc.exists());

			if (fileLoc.exists()) {
				fis = new FileInputStream(fileLoc);

				for (int i = 0; i < fileLoc.length(); i++) {
					System.out.print((char) fis.read());
				}

			}else {
				System.out.println("-- File not Found.. Check your path..");
			}

			// System.out.println("Length: "+fileLoc.length());

		} catch (Exception e) {
			System.out.println("-- Failed   due  to " + e);
		}finally {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
