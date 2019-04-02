package com.forewei.service;

import com.forewei.dao.TestDao;

/**
 * @Author forewei
 * @date 2019-4-2 17:10
 */
public class TestService2 implements TestDao{

	private TestService1 testService1;

	public TestService2(String s) {
	}

	@Override
	public void query() {
		testService1.query();
	}

	public void setTestService1(TestService1 testService1) {
		this.testService1 = testService1;
	}

	public TestService1 getTestService1() {
		return testService1;
	}

}
