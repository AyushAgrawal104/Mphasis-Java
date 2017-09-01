package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DBTest {

	public static void main(String[] args) {

		// 1. Load Driver class

		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");
			// System.out.println("-- Driver class loded");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:mphasis", "scott", "tiger");
			// System.out.println("-- Connection Established with "+con);

			// CReate a statement interface

			Statement stmt = con.createStatement();

			String qry = "insert into customer values(2,'Ozvitha',71)";

			stmt.executeUpdate(qry);

			System.out.println("--- Record Saved...");

		} catch (Exception e) {
			System.out.println("--- Failed due to " + e);
		}

	}

}
