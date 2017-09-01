package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test {
	
	public static void main(String[] args) {

		// 1. Load Driver class

		try {

			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("-- Driver class loded");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
			Statement stmt = con.createStatement();

			String qry = "create table bank(cust_id int primary key,cust_name varchar(20))";

			stmt.executeUpdate(qry);

			System.out.println("--- Query Processed..");

		} catch (Exception e) {
			System.out.println("--- Failed due to " + e);
		}

	}

	
	
	

}
