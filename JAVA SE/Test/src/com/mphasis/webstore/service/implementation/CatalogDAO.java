package com.mphasis.webstore.service.implementation;

import java.util.List;
import java.util.Set;

import com.mphasis.webstore.dao.interfaces.ICatalogDAO;
import com.mphasis.webstore.domain.interfaces.ICatalog;
import com.mphasis.webstore.domain.interfaces.ICategory;


public class CatalogDAO implements ICatalogDAO {

	/*
	 * @param catalog @return
	 */
	public boolean addCatalog(ICatalog catalog) {

		
		return true;
	}

	/*
	 * @param catalog @return
	 */
	public boolean addCategory(ICatalog catalog, ICategory category) {

		
		return true;
	}

	/*
	 * @param id @return
	 */
	public ICatalog getCatalog(long id) {

		
		return null;
	}

	/*
	 * @return
	 */
	public List<ICatalog> getCatalogs() {

		
		return null;
	}

	/*
	 * @param catalog @return
	 */
	public Set<ICategory> getCategories(ICatalog catalog) {

		
		return null;
	}

	/*
	 * @param catalog @return
	 */
	public boolean removeCatalog(ICatalog catalog) {

		
		return true;
	}

	/*
	 * @param category @return
	 */
	public boolean removeCategory(ICatalog catalog, ICategory category) {

		
		return true;
	}

	/*
	 * @param catalog @return
	 */
	public boolean updateCatalog(ICatalog catalog) {

		
		return true;
	}
}
