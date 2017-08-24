package com.mphasis.webstore.service.interfaces;

import java.util.List;
import java.util.Set;

import com.mphasis.webstore.domain.interfaces.ICatalog;
import com.mphasis.webstore.domain.interfaces.ICategory;

public interface ICatalogDAO {

	boolean addCatalog(ICatalog catalog);

	boolean addCategory(ICatalog catalog, ICategory category);

	ICatalog getCatalog(long id);

	List<ICatalog> getCatalogs();

	Set<ICategory> getCategories(ICatalog catalog);

	boolean removeCatalog(ICatalog catalog);

	boolean removeCategory(ICatalog catalog, ICategory category);

	boolean updateCatalog(ICatalog catalog);
}
