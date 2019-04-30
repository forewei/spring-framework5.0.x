package com.forewei.test;

import com.forewei.config.AppConfig;
import com.forewei.envets.MailBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author forewei
 * @date 2019-4-30 10:16
 */
public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext
				atx = new AnnotationConfigApplicationContext(AppConfig.class);
		atx.getBean(MailBean.class).send();
	}
}
