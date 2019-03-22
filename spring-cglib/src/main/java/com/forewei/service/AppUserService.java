package com.forewei.service;

import com.forewei.dao.AppUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author forewei
 * @date 2019-3-22 17:23
 */
@Service
public class AppUserService {

	@Autowired
	AppUserDao userDao;

	public void query() {
		System.out.println(userDao.findList());
	}
}
