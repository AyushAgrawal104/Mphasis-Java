package com.mphasis.webstore.service.implementation;

import java.util.Set;

import com.mphasis.webstore.dao.interfaces.IOrderDAO;
import com.mphasis.webstore.domain.interfaces.IOrder;
import com.mphasis.webstore.service.interfaces.OrderService;

public class OrderServiceImpl implements OrderService {

	/*
	 * @param order @return
	 */
	public boolean addOrder(IOrder order) {

		
		return true;
	}

	/*
	 * @param id @return
	 */
	public IOrder getOrder(long id) {

		
		return null;
	}

	/*
	 * @param order @return
	 */
	public boolean removeOrder(IOrder order) {
		
		return true;
	}	

/*
 * @param userName @return
 */
public Set<IOrder> getOrders(String userName) {

	
	
	return null;
}

}