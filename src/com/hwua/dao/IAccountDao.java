package com.hwua.dao;

public interface IAccountDao {
	void out(String outer, Integer money);
	void in(String inner, Integer money);
}
