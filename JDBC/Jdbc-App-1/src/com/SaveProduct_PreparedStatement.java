package com;

import java.util.List;

import com.product.dao.ProductDaoImpl;
import com.product.model.Product;

public class SaveProduct_PreparedStatement {

	public static void main(String[] args) {
		
		Product prod=new Product();
		prod.setProdId("P007");
		prod.setProdName("Mobile");
		prod.setPrice(4453);
		
		
		ProductDaoImpl prodDao=new ProductDaoImpl();
		prodDao.saveProduct_v1(prod);
		
		 

	}

}
