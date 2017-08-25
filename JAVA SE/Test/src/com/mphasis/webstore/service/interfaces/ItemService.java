package com.mphasis.webstore.service.interfaces;

import com.mphasis.webstore.domain.interfaces.IItem;

public interface ItemService {

	IItem getItem(long id);

	boolean updateItem(IItem item);
}
