package com.forewei;

import com.forewei.config.AppConfig;
import com.forewei.service.AppUserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @Author forewei
 * @date 2019-3-22 17:25
 */
@EnableAspectJAutoProxy
public class test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext
				= new AnnotationConfigApplicationContext(AppConfig.class);
		AppUserService dao = annotationConfigApplicationContext.getBean(AppUserService.class);
		dao.query();
		dao.query();
	}
}
