package com.mphasis.webstore.service.interfaces;

import java.util.Set;

import com.mphasis.webstore.domain.interfaces.ICategory;
import com.mphasis.webstore.domain.interfaces.IProduct;

public interface CategoryService {

	boolean addSubCategory(ICategory category, ICategory subCategory);

	boolean addProduct(ICategory category, IProduct product);

	ICategory getCategory(long id);

	Set<ICategory> getSubCategories(ICategory category);

	Set<IProduct> getProducts(ICategory category);

	boolean hasSubCategories(ICategory category);

	boolean hasProducts(ICategory category);

	boolean removeProduct(ICategory category, IProduct product);	

	boolean updateCategory(ICategory category);
}
