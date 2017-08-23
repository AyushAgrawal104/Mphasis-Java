package com.prod.service;

import com.prod.beans.Product;
import com.prod.dao.ProductDao;
import com.prod.dao.ProductDaoImpl;

public class SaveProductServiceImpl implements SaveProductService {

	private ProductDao saveDao = new ProductDaoImpl();

	public void storeProduct(Product prod) {

		saveDao.saveProduct(prod);
	}

}
