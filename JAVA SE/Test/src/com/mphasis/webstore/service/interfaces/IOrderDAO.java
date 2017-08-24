package com.mphasis.webstore.service.interfaces;

import java.util.Set;

import com.mphasis.webstore.domain.interfaces.ICreditCard;
import com.mphasis.webstore.domain.interfaces.IOrder;

public interface IOrderDAO {

	IOrder getOrder(long id);

	Set<IOrder> getOrders(String userName);

	boolean addOrder(IOrder order);

	boolean removeOrder(IOrder order);
}
