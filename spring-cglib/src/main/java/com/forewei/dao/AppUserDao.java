package com.forewei.dao;

import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * @Author forewei
 * @date 2019-3-22 17:15
 */
public interface AppUserDao {

	@Select("select * from app_user")
	List<Map<Integer,Object>> findList();
}
