package com.prod.service;

import com.prod.beans.Product;
import com.prod.dao.ProductDao;
import com.prod.dao.ProductDaoImpl;

public class SearchProductServiceImpl implements SearchProductService {

	private ProductDao prodDao = new ProductDaoImpl();

	public Product searchProd(String prodId) {
		return prodDao.findProduct(prodId);
	}

}
