package com.mphasis.webstore.service.implementation;

import java.util.Set;

import com.mphasis.webstore.dao.interfaces.ICategoryDAO;
import com.mphasis.webstore.domain.interfaces.ICategory;
import com.mphasis.webstore.domain.interfaces.IProduct;


public class CategoryDAO implements ICategoryDAO {

	/*
	 * @param category @param product @return
	 */
	public boolean addProduct(ICategory category, IProduct product) {

		
		return true;
	}

	/*
	 * @param category @param subCategory @return
	 */
	public boolean addSubCategory(ICategory category, ICategory subCategory) {

		
		return true;
	}

	/*
	 * @param id @return
	 */
	public ICategory getCategory(long id) {

	
		return null;
	}

	/*
	 * @param category @return
	 */
	public Set<IProduct> getProducts(ICategory category) {

		
		return null;
	}

	/*
	 * @param category @return
	 */
	public Set<ICategory> getSubCategories(ICategory category) {

		
		return null;
	}

	public boolean hasProducts(ICategory category) {

		
		return  false;
	}

	/*
	 * @param category @return
	 */
	public boolean hasSubCategories(ICategory category) {

		
		return false;
	}

	/*
	 * @param category @return
	 */
	public boolean removeProduct(ICategory category, IProduct product) {

		
		return true;
	}

	/*
	 * @param category @return
	 */
	public boolean updateCategory(ICategory category) {

		
		return true;
	}
}
