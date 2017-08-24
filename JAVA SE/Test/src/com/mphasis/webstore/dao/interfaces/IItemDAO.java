package com.mphasis.webstore.dao.interfaces;

import com.mphasis.webstore.domain.interfaces.IItem;

public interface IItemDAO {

	IItem getItem(long id);

	boolean updateItem(IItem item);
}
