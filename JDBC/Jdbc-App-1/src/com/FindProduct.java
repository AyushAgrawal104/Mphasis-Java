package com;

import java.util.List;

import com.product.dao.ProductDaoImpl;
import com.product.model.Product;

public class FindProduct {

	public static void main(String[] args) {

		ProductDaoImpl prodDao = new ProductDaoImpl();

		Product p = prodDao.findProduct("P00001");
		
		System.out.println(p.getProdId());
		System.out.println(p.getProdName());
		System.out.println(p.getPrice());
		System.out.println("--------------------");

	}

}
