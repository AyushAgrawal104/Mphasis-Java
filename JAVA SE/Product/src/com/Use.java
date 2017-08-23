package com;

import com.prod.beans.Product;
import com.prod.dao.ProductBackupDao;
import com.prod.dao.ProductDaoImpl;
import com.prod.dao.ProductSaveDao;
import com.prod.dao.ProductSearchDao;

public class Use {

	public static void main(String[] args) {
		
		Product prod=new Product();
		prod.setProdId("P001");
		prod.setProdName("Pen");
		prod.setPrice(746);
		
		//ProductDaoImpl prodDao=new ProductDaoImpl();
		//prodDao.saveProduct(prod);
		
		ProductSaveDao prodSave=new ProductDaoImpl();
		prodSave.saveProduct(prod);
		prodSave.backUp();
		
		ProductSearchDao searchDao=new ProductDaoImpl();
		searchDao.findProduct("P001");
		
		
		ProductBackupDao backUp=new ProductDaoImpl();
		backUp.backUp();
		
		
	}

}
