package com.prod.dao;

import com.prod.beans.Product;

public interface ProductSearchDao {

	Product findProduct(String prodId);

}
