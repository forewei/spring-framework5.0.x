package com.forewei.service;

import com.forewei.dao.TestDao;
import jdk.nashorn.internal.objects.annotations.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @Author forewei
 * @date 2019-4-2 16:42
 */
@Component
public class TestService1 implements TestDao {


	public TestService1(String s) {
		System.out.println("有参构造");
	}


	public TestService1() {
		System.out.println("Test1 无参构造");
	}
	@Override
	public void query() {
		System.out.println("xml---");
	}
	public void find(){
		System.out.println("depend");
	}
}
