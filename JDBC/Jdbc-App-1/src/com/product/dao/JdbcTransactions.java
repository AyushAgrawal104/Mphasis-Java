package com.product.dao;

import java.sql.Connection;
import java.sql.Statement;

import static com.product.dao.DbUtils.*;

public class JdbcTransactions {

	public void demo1() {

		Connection con = null;
		try {
			con = getConnection();

			String q1 = "insert into product values('P008','Note Book',765)";
			String q2 = "update product set product_name='My Note Book' where product_id='P001'";
			String q3 = "delete from product where product_id='P006'";
			Statement stmt = con.createStatement();

			stmt.addBatch(q2);
			stmt.addBatch(q1);
			stmt.addBatch(q3);

			int[] res = stmt.executeBatch();
			for (int i = 0; i < res.length; i++) {
				if (res[i] == 1)
					System.out.println((i + 1) + " Quey ecuted");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeConnection();
		}

	}

	public void demo2() {

		Connection con = null;
		try {
			con = getConnection();
			con.setAutoCommit(false);

			String q1 = "insert into product values('P009','Dell Laptop',76435)";
			String q2 = "update product set product_name='Cell Phone' where product_id='P001'";
			String q3 = "delete from product where product_id='P008'";
			Statement stmt = con.createStatement();

			stmt.addBatch(q1);
			stmt.addBatch(q2);
			stmt.addBatch(q3);
			
			boolean flag = true;
			int count = 0;

			int[] res = stmt.executeBatch();
			for (int i = 0; i < res.length; i++) {
				if (res[i] == 0) {
					flag = false;
				}
				if(res[i]==1)
				++count;
			}

			if (flag) {
				con.commit();
			} else {
				con.rollback();
			}
			
			System.out.println(count+" Statements Executed");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeConnection();
		}

	}

}
