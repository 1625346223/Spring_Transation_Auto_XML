package com.hwua.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hwua.service.IAccountService;

public class MyTest {
	@Test
	public void test01() {
		// 1 获得spring-IOC容器(单例)
		String xmlPath = "applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(xmlPath);
		// 2.通过容器获取bean对象
		IAccountService ias = (IAccountService) context.getBean("accountService");
		ias.transfer("jack", "rose", 500);
	}
}
