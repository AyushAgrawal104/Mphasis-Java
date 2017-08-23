package com.prod.dao;

import com.prod.beans.Product;

public interface ProductSaveDao {

	void saveProduct(Product prod);
	void backUp();

}
