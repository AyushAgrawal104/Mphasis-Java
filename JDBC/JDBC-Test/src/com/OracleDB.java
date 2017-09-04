package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import oracle.jdbc.driver.OracleDriver;

public class OracleDB {

	public static void main(String[] args) {

		// 1. Load Driver class

		Connection con = null;
	

		try {

			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// System.out.println("-- Driver class loded");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:mphasis", "scott", "tiger");
			// System.out.println("-- Connection Established with "+con);

		} catch (Exception e) {
			System.out.println("--- Failed due to " + e);
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
