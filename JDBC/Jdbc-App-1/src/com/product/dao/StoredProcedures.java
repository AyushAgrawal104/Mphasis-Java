package com.product.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Types;

public class StoredProcedures {

	// simple proc ..> p1
	
	/*
	  CREATE OR REPLACE PROCEDURE p1 
		AS 
		BEGIN 
   
   		update product set product_name='Monitor' where product_id='P001';
		commit;

		END; 
	
	 */
	public void demo1() {

		Connection con = null;
		try {
			con = DbUtils.getConnection();

			CallableStatement cs = con.prepareCall("CALL p1()");
			cs.execute();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DbUtils.closeConnection();
		}

	}

	// simple proc with in parameter ..> p1
	/*CREATE OR REPLACE PROCEDURE p1(pid in varchar2) 
	AS 
	BEGIN 
	   
	   update product set product_name='Monitor' where product_id=pid;
	  commit;

	END; 
	*/
	public void demo2() {

		Connection con = null;
		try {
			con = DbUtils.getConnection();

			CallableStatement cs = con.prepareCall("CALL p11(?)");

			cs.setString(1, "P005");

			cs.execute();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DbUtils.closeConnection();
		}

	}

	// simple proc with out parameter ..> 
	/*
    CREATE OR REPLACE PROCEDURE p2(maxSal out number) 
	IS 
	BEGIN 
	   
	select max(sal) into maxSal from emp;
	 
	END; 
	  
	*/
	public void demo3() {

		Connection con = null;
		try {
			con = DbUtils.getConnection();

			CallableStatement cs = con.prepareCall("CALL p2(?)");

			cs.registerOutParameter(1, Types.INTEGER);

			cs.execute();
			int res = cs.getInt(1);
			System.out.println("Result: " + res);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DbUtils.closeConnection();
		}

	}
	
	// simple proc with in and out parameter ..> squareNum
	
	/*
	    create or replace PROCEDURE squareNum(x IN OUT number) IS 
 		BEGIN  
  		x := x * x; 
		END;
	 * 
	 * 
	 */
		public void demo4() {

			Connection con = null;
			try {
				con = DbUtils.getConnection();

				CallableStatement cs = con.prepareCall("CALL squareNum(?)");

				cs.setInt(1, 10);
				cs.registerOutParameter(1, Types.INTEGER);
				
				cs.execute();
				int res = cs.getInt(1);
				System.out.println("Result: " + res);

			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				DbUtils.closeConnection();
			}

		}


		
		// simple proc with in,out parameter ..> squareNum
		
		/*
		create or replace PROCEDURE squareNum(x IN number,y OUT number) IS 
 		BEGIN  
  		y := x * x; 
		END; 

		 */
				public void demo5() {

					Connection con = null;
					try {
						con = DbUtils.getConnection();

						CallableStatement cs = con.prepareCall("CALL squareNum(?,?)");

						cs.setInt(1, 5);
						cs.registerOutParameter(2, Types.INTEGER);
						
						cs.execute();
						int res = cs.getInt(2);
						System.out.println("Result: " + res);

					} catch (Exception e) {
						e.printStackTrace();
					} finally {
						DbUtils.closeConnection();
					}

				}
				
				
				// Involing a function with out parameter and it return type
				/*
				 * CREATE OR REPLACE FUNCTION totalEmps
				RETURN number IS 
   				total number(2) := 0; 
				BEGIN 
   				SELECT count(*) into total 
   				FROM emp; 
    
   				RETURN total; 
				END; 
				/ 
				 */
				public void demo6() {

					Connection con = null;
					try {
						con = DbUtils.getConnection();

						CallableStatement cs = con.prepareCall("{? = call totalEmps()}");

						
						cs.registerOutParameter(1, Types.INTEGER);
						
						cs.execute();
						int res = cs.getInt(1);
						System.out.println("Result: " + res);

					} catch (Exception e) {
						e.printStackTrace();
					} finally {
						DbUtils.closeConnection();
					}

				}
				
				// function with both in and with return value
				/*
				 * 
				 * create or replace FUNCTION findMax(x IN number, y IN number)  
				RETURN number 
				IS 
    			z number; 
				BEGIN 
   				IF x > y THEN 
      			z:= x; 
   				ELSE 
      			Z:= y; 
   				END IF;  
   				RETURN z; 
				END; 

                / 
				 */
				
				public void demo7() {

					Connection con = null;
					try {
						con = DbUtils.getConnection();

						CallableStatement cs = con.prepareCall("{? = call findMax(?,?)}");

						cs.setInt(2, 100);
						cs.setInt(3, 765);
						
						cs.registerOutParameter(1, Types.INTEGER);
						
						cs.execute();
						String res = cs.getString(1);
						System.out.println("Max Value is : " + res);

					} catch (Exception e) {
						e.printStackTrace();
					} finally {
						DbUtils.closeConnection();
					}

				}	

}
