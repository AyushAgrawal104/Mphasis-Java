package com;

import com.prod.beans.Product;
import com.prod.service.SaveProductService;
import com.prod.service.SaveProductServiceImpl;
import com.prod.service.SearchProductService;
import com.prod.service.SearchProductServiceImpl;

public class Use {

	public static void main(String[] args) {

		Product prod = new Product();
		prod.setProdId("P001");
		prod.setProdName("Pen");
		prod.setPrice(746);
		
		
		SaveProductService saveService=new SaveProductServiceImpl();
		saveService.storeProduct(prod);
		
		
		SearchProductService search=new SearchProductServiceImpl();
		search.searchProd("P001");
		
		

	}

}
