package com.forewei.envets;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @Author forewei
 * @date 2019-4-30 17:33
 */
@Component
public class MailBean {

	@Autowired
	ApplicationContext applicationContext;
	public void send(){
		applicationContext.publishEvent(new SpringMailEvent(applicationContext));
	}
}
