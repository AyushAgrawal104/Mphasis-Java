package com.mphasis.webstore.dao.implementation;

import java.util.Set;

import com.mphasis.webstore.dao.interfaces.IOrderDAO;
import com.mphasis.webstore.domain.interfaces.IOrder;

public class OrderDAO implements IOrderDAO {

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
