package com.prod.dao;

import com.prod.beans.Product;

public class ProductDaoImpl implements ProductDao{


	public void backUp() {
		System.out.println("--- Dao: Backing up Records");
	}

	public void saveProduct(Product prod) {
		System.out.println("--- Dao: " + prod.getProdName() + " saved to DB");
	}

	public void listAll() {
		System.out.println("-- Dao: Listing all Products");
	}

	public Product findProduct(String prodId) {
		System.out.println("--- Dao: Searching Product");
		return null;
	}

	public void deleteProduct(String prodId) {
		System.out.println("--- Dao: " + prodId + " Deleted");
	}

	public void updateProduct(Product prod) {
		System.out.println("--- Dao: " + prod.getProdName() + " updated to DB");
	}

}
