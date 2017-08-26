package com;

import java.io.File;
import java.io.FileWriter;

public class WriterDemo {

	public static void main(String[] args) {

		try {

			File fileLoc = new File("D:/files/one.txt");
			// fileLoc.createNewFile();

			String s1 = "I am loving this day!";

			FileWriter fw = new FileWriter(fileLoc);

			fw.write(s1);

			System.out.println("---- Writing is done");
			fw.close();

		} catch (Exception e) {
			System.out.println("-- Failed due to " + e);
		}

	}

}
