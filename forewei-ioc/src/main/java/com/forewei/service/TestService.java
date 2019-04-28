package com.forewei.service;

import com.forewei.dao.TestDao;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @Author forewei
 * @date 2019-4-2 16:19
 */
@Component
public class TestService implements TestDao {

	public TestService(){
		System.out.println("TestService");
	}

	@Override
	public void query() {
		System.out.println("annotation ----");
	}
	@PostConstruct
	public void test(){
		System.out.println("postconstruct");
	}
}
