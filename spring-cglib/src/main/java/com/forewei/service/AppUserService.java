package com.forewei.service;

import com.forewei.dao.AppUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author forewei
 * @date 2019-3-22 17:23
 */
@Service
public class AppUserService {

	@Autowired
	private List<AppUserDao> appUserDaoList;

	public List<AppUserDao> getAppUserDaoList() {
		return appUserDaoList;
	}

	public void setAppUserDaoList(List<AppUserDao> appUserDaoList) {
		this.appUserDaoList = appUserDaoList;
	}
	//	@Autowired
//	AppUserDao userDao;
//
//	public void query() {
//		System.out.println(userDao.findList());
//	}


}
