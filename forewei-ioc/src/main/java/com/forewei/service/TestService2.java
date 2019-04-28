package com.forewei.service;

import com.forewei.dao.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author forewei
 * @date 2019-4-2 17:10
 */
@Service
public class TestService2 {

	@Autowired
	private List<TestDao> testDaos = new ArrayList<>();

	public void test(){
		testDaos.forEach(f->{
			System.out.println(f);
		});
	}
}
