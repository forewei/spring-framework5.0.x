package com.forewei.service;

import com.forewei.dao.AppUserDao;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Author forewei
 * @date 2019-4-8 11:37
 */
//@Service
public class TestService implements AppUserDao {
	@Override
	public List<Map<Integer, Object>> findList() {
		System.out.println("test");
		return null;
	}
}
