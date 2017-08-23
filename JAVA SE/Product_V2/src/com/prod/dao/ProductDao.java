package com.prod.dao;

import com.prod.beans.Product;

public interface ProductDao {

	void backUp();

	void saveProduct(Product prod);

	void listAll();

	Product findProduct(String prodId);

	void deleteProduct(String prodId);

	void updateProduct(Product prod);

}