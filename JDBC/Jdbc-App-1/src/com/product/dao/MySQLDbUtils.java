package com.product.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLDbUtils {

	private MySQLDbUtils() {
		// TODO Auto-generated constructor stub
	}

	private static Connection con = null;

	public static Connection getConnection() {

		if (con == null) {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");

			} catch (Exception e) {

				e.printStackTrace();
			}
		} // end of if
		return con;
	}// get connection end

	
	public static void closeConnection() {
		
		if(con!=null)
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
	} // closeConnection end

} // class end
