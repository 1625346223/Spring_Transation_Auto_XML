package com.hwua.service.impl;

import com.hwua.dao.IAccountDao;
import com.hwua.service.IAccountService;

public class AccountServiceImpl implements IAccountService {
	private IAccountDao accountDao;
	public void setAccountDao(IAccountDao accountDao) {
		this.accountDao = accountDao;
	}

	@Override
	public void transfer(String outer, String inner, Integer money) {
		accountDao.out(outer, money);
		//断电
		int i = 1/0;
		accountDao.in(inner, money);
	}

}
