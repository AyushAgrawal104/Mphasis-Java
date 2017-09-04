package com;

import java.util.List;

import com.product.dao.ProductDaoImpl;
import com.product.model.Product;

public class ListProducts_ResultSetTypes {

	public static void main(String[] args) {

		ProductDaoImpl prodDao = new ProductDaoImpl();

		Product prod=new Product();
		prod.setProdId("P001");
		prod.setProdName("IPhone");
		prod.setPrice(44753);

		
		prodDao.updateProduct_v1(prod);
		
		/*Product p = prodDao.findProduct_v2();

		System.out.println(p.getProdId());
		System.out.println(p.getProdName());
		System.out.println(p.getPrice());
		System.out.println("--------------------");
*/
	}

}
