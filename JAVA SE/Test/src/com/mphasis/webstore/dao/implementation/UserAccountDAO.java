package com.mphasis.webstore.dao.implementation;

import com.mphasis.webstore.dao.interfaces.IUserAccountDAO;
import com.mphasis.webstore.domain.interfaces.IUserAccount;

public class UserAccountDAO implements IUserAccountDAO {

	/*
	 * @param account @return
	 */
	public boolean addUserAccount(IUserAccount account) {

		return true;
	}

	/*
	 * @param id @return
	 */
	public IUserAccount getUserAccount(long id) {

		
		return null;
	}

	/*
	 * @param userName @param pwd @return
	 */
	public IUserAccount getUserAccount(String userName, String pwd) {

		
		return null;
	}

	/*
	 * @param userName @return
	 */
	public IUserAccount getUserAccount(String userName) {

		
		return null;
	}

	/*
	 * @param account @return
	 */
	public boolean removeUserAccount(IUserAccount account) {

		
		return true;
	}

	/*
	 * @param account @return
	 */
	public boolean updateUserAccount(IUserAccount account) {

		
		return true;
	}
}
