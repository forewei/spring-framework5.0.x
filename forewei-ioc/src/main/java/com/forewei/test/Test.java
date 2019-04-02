package com.forewei.test;

import com.forewei.config.Appconfig;
import com.forewei.dao.TestDao;
import com.forewei.service.TestService2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author forewei
 * @date 2019-4-2 16:03
 */
@EnableAspectJAutoProxy
public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext
				= new AnnotationConfigApplicationContext(Appconfig.class);
		TestService2 testService2 = (TestService2) annotationConfigApplicationContext.getBean("testService2");
		testService2.query();
//		TestDao bean = annotationConfigApplicationContext.getBean(TestDao.class);
//		bean.query();
//
//		ClassPathXmlApplicationContext classPathXmlApplicationContext
//				 = new ClassPathXmlApplicationContext("classpath:\\spring.xml");
//		classPathXmlApplicationContext.getBean("testService1");

	}


}
