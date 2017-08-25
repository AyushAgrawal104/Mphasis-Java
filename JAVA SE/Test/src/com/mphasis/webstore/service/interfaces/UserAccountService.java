package com.mphasis.webstore.service.interfaces;

import com.mphasis.webstore.domain.interfaces.IUserAccount;

public interface UserAccountService {

	boolean addUserAccount (IUserAccount account);

	IUserAccount getUserAccount(long id);

	IUserAccount getUserAccount(String userName);

	IUserAccount getUserAccount(String userName, String pwd);	

	boolean removeUserAccount(IUserAccount account);

	boolean updateUserAccount(IUserAccount account);
}
