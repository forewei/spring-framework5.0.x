package com.forewei.spring;


import com.forewei.Test;
import com.forewei.dao.AppUserDao;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import java.lang.reflect.Proxy;

/**
 * @Author forewei
 * @date 2019-3-27 15:24
 */

public class ForeweiFactoryBean implements FactoryBean {

	Class clazz;

	public ForeweiFactoryBean(Class clazz) {
		this.clazz = clazz;
	}

	@Override
	public Object getObject() throws Exception {
		Class[] clazzs = new Class[]{clazz};
		// 动态代理
		Object o = Proxy.newProxyInstance(Test.class.getClassLoader(), clazzs, new ForeweiInvocationHandler());
		return o;
	}

	@Nullable
	@Override
	public Class<?> getObjectType() {
		return clazz;
	}
}
