package com.product.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtils {

	private DbUtils() {
		// TODO Auto-generated constructor stub
	}

	private static Connection con = null;

	public static Connection getConnection() {

		if (con == null) {
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:mphasis", "scott", "tiger");

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
