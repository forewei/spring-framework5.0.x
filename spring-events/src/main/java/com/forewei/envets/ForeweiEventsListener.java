package com.forewei.envets;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.stereotype.Component;

/**
 * @Author forewei
 * @date 2019-4-30 10:18
 */
@Component
public class ForeweiEventsListener implements ApplicationListener<SpringMailEvent> {

	@Autowired
	private ApplicationContext applicationContext;


	@Override
	public void onApplicationEvent(SpringMailEvent event) {
		System.out.println("mail send");
	}
}
