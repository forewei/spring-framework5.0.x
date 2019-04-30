package com.forewei.envets;

import org.springframework.context.ApplicationEvent;
import org.springframework.stereotype.Service;

/**
 * @Author forewei
 * @date 2019-4-30 10:23
 */

public class SpringMailEvent extends ApplicationEvent{

	private String content;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * Create a new ApplicationEvent.
	 *
	 * @param source the object on which the event initially occurred (never {@code null})
	 */
	public SpringMailEvent(Object source) {
		super(source);
	}
}
