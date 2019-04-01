package com.forewei;

import com.forewei.config.AppConfig;
import com.forewei.dao.AppUserDao;
import com.forewei.service.AppUserService;
import com.forewei.spring.ForeweiInvocationHandler;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.lang.reflect.Proxy;

/**
 * @Author forewei
 * @date 2019-3-22 17:25
 */
@EnableAspectJAutoProxy
public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext
				= new AnnotationConfigApplicationContext(AppConfig.class);
//		AppUserService dao = annotationConfigApplicationContext.getBean(AppUserService.class);
		AppUserDao dao1 = (AppUserDao) annotationConfigApplicationContext.getBean("appUserDao");
		dao1.findList();
//		// java动态代理
//		Class[] clazz = {AppUserDao.class};
//		AppUserDao dao2 = (AppUserDao) Proxy.newProxyInstance(Test.class.getClassLoader(), clazz, new ForeweiInvocationHandler());
//		dao2.findList();
	}
}
