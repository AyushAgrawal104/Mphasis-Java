package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteTest {

	public static void main(String[] args) {

		// 1. Load Driver class

		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");
			// System.out.println("-- Driver class loded");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:mphasis", "scott", "tiger");
			// System.out.println("-- Connection Established with "+con);

			// CReate a statement interface

			Statement stmt = con.createStatement();

			String qry = "delete from customer where cust_id=200";

			int res = stmt.executeUpdate(qry);

			if (res != 0) {
				System.out.println("--- Record Deleted...");
			} else {
				System.out.println("--- Issue while  deleting.. record notu deleted");
			}
		} catch (Exception e) {
			System.out.println("--- Failed due to " + e);
		}

	}

}
