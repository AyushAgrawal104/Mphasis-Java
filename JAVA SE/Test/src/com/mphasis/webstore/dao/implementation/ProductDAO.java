package com.mphasis.webstore.dao.implementation;

import java.util.Set;
import com.mphasis.webstore.dao.interfaces.IProductDAO;
import com.mphasis.webstore.domain.interfaces.IItem;
import com.mphasis.webstore.domain.interfaces.IProduct;

public class ProductDAO implements IProductDAO {

	/*
	 * @param product @param item @return
	 */
	public boolean addItem(IProduct product, IItem item) {

		return false;
	}

	/*
	 * @param product @return
	 */
	public Set<IItem> getItems(IProduct product) {

		return null;
	}

	/*
	 * @param id @return
	 */
	public IProduct getProduct(long id) {

		return null;
	}

	/*
	 * @param product @return
	 */
	public boolean hasDisplayableItem(IProduct product) {

		return false;
	}

	/*
	 * @param product @return
	 */
	public Integer getItemsCount(IProduct product) {

		return 0;
	}

	/*
	 * @param product @param item @return
	 */
	public boolean removeItem(IProduct product, IItem item) {

		
		return true;
	}

	/*
	 * @param category @return
	 */
	public boolean updateProduct(IProduct product) {

		
		return true;
	}
}
