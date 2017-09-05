package com.product.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



import static com.product.dao.DbUtils.*;
import com.product.model.Product;

public class ProductDaoImpl {

	private Connection con;

	public void saveProduct(Product prod) {

		try {
			con = getConnection();
			String q1 = "insert into product values('" + prod.getProdId() + "','" + prod.getProdName() + "',"
					+ prod.getPrice() + ")";
			System.out.println(q1);
			Statement stmt = con.createStatement();
			stmt.executeUpdate(q1);
			System.out.println("-- recod Saved....");
		} catch (Exception e) {

		} finally {
			closeConnection();
		}

	}

	public void saveProduct_v1(Product prod) {

		try {
			con = getConnection();

			String q2 = "insert into product values(?,?,?)";
			PreparedStatement ps = con.prepareStatement(q2);

			ps.setString(1, prod.getProdId());
			ps.setString(2, prod.getProdName());
			ps.setDouble(3, prod.getPrice());

			ps.executeUpdate();
			System.out.println("--- Product saved");

		} catch (Exception e) {

		} finally {
			closeConnection();
		}

	}

	public Product findProduct(String prodId) {
		Product prod = null;
		try {
			con = getConnection();
			String qry = "select * from product where product_id=?";
			PreparedStatement ps = con.prepareStatement(qry);
			ps.setString(1, prodId);
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				prod = new Product();
				prod.setProdId(rs.getString(1));
				prod.setProdName(rs.getString(2));
				prod.setPrice(rs.getDouble(3));
			} else {
				System.out.println("--- No record found with " + prodId);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeConnection();
		}

		return prod;

	}

	public Product findProduct_v1() { // MySQL
		Product prod = null;
		try {
			con = MySQLDbUtils.getConnection();
			String qry = "select * from product";
			Statement stmt = con.createStatement();

			ResultSet rs = stmt.executeQuery(qry);

			rs.absolute(3);

			// if (rs.next()) {
			prod = new Product();
			prod.setProdId(rs.getString(1));
			prod.setProdName(rs.getString(2));
			prod.setPrice(rs.getDouble(3));

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeConnection();
		}

		return prod;

	}

	public Product findProduct_v2() { // Oracle
		Product prod = null;
		try {
			con = getConnection();
			String qry = "select * from product";

			Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);

			ResultSet rs = stmt.executeQuery(qry);

			rs.absolute(3);

			// if (rs.next()) {
			prod = new Product();
			prod.setProdId(rs.getString(1));
			prod.setProdName(rs.getString(2));
			prod.setPrice(rs.getDouble(3));

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeConnection();
		}

		return prod;

	}

	public void updateProduct(Product prod) {

		try {
			con = getConnection();

			String q2 = "update product set product_name=?,price=? where product_id=?";

			PreparedStatement ps = con.prepareStatement(q2);

			ps.setString(1, prod.getProdName());
			ps.setDouble(2, prod.getPrice());
			ps.setString(3, prod.getProdId());

			ps.executeUpdate();
			System.out.println("--- Product Updated");

		} catch (Exception e) {

		} finally {
			closeConnection();
		}

	}

	public void updateProduct_v1(Product prod) {

		try {
			con = getConnection();

			Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

			String qry = "select * from product where product_id='" + prod.getProdId() + "'";
			System.out.println("Quetry: " + qry);
			ResultSet rs = stmt.executeQuery(qry);

			if (rs.next()) {
				
			}

			/*rs.updateString(2, prod.getProdName());
			rs.updateDouble(3, prod.getPrice());
*/
			rs.deleteRow();
			rs.insertRow();
			rs.updateRow();
			

			System.out.println("-- Record Deleted");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeConnection();
		}

	}

	public List<Product> listAll() {
		List<Product> prods = new ArrayList<>();

		try {
			con = getConnection();
			String q3 = "select * from product";
			Statement stmt = con.createStatement();

			ResultSet rs = stmt.executeQuery(q3);

			while (rs.next()) {

				Product prod = new Product();

				prod.setProdId(rs.getString(1));
				prod.setProdName(rs.getString(2));
				prod.setPrice(rs.getDouble(3));

				prods.add(prod);

				/*
				 * System.out.println(rs.getString(1)); System.out.println(rs.getString(2));
				 * System.out.println(rs.getString(3)); System.out.println("-----------------");
				 */
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeConnection();
		}

		return prods;
	}// end of listALl

}
