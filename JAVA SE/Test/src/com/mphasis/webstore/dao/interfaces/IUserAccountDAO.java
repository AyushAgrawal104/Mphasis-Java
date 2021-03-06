package com.mphasis.webstore.dao.interfaces;

import com.mphasis.webstore.domain.interfaces.IUserAccount;

public interface IUserAccountDAO {

	boolean addUserAccount (IUserAccount account);

	IUserAccount getUserAccount(long id);

	IUserAccount getUserAccount(String userName);

	IUserAccount getUserAccount(String userName, String pwd);	

	boolean removeUserAccount(IUserAccount account);

	boolean updateUserAccount(IUserAccount account);
}
