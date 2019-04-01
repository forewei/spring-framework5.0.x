package com.forewei.spring;



import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author forewei
 * @date 2019-3-27 15:29
 */


public class ForeweiInvocationHandler implements InvocationHandler{
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println(method.getAnnotation(Select.class).value()[0]);
		return null;
	}
}
