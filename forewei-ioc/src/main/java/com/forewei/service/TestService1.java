package com.forewei.service;

import com.forewei.dao.TestDao;

/**
 * @Author forewei
 * @date 2019-4-2 16:42
 */
public class TestService1 implements TestDao {
	public TestService1(String s) {
		System.out.println(s);
	}
	@Override
	public void query() {
		System.out.println("xml---");
	}
	public void find(){
		System.out.println("depend");
	}
}
