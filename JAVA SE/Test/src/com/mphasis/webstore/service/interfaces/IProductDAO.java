package com.mphasis.webstore.service.interfaces;

import java.util.Set;

import com.mphasis.webstore.domain.interfaces.IItem;
import com.mphasis.webstore.domain.interfaces.IProduct;

public interface IProductDAO {

	boolean addItem(IProduct product, IItem item);

	Set<IItem> getItems(IProduct product);

	IProduct getProduct(long id);

	Integer getItemsCount(IProduct product);

	boolean hasDisplayableItem(IProduct product);

	boolean removeItem(IProduct product, IItem item);

	boolean updateProduct(IProduct product);
}
