package com.hwua.dao.impl;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.hwua.dao.IAccountDao;

public class AccountDaoImpl extends JdbcDaoSupport implements IAccountDao{

	@Override
	public void out(String outer, Integer money) {
		this.getJdbcTemplate().update("update account set money = money - ? where username = ?", money,outer);
	}

	@Override
	public void in(String inner, Integer money) {
		this.getJdbcTemplate().update("update account set money = money + ? where username = ?", money,inner);
	}
	
}
