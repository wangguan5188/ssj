package com.wangguan.dao;

import java.util.Map;

import org.springframework.stereotype.Repository;

import com.wangguan.dao.impl.BaseDaoImpl;

@Repository
public class UserDao extends BaseDaoImpl {
	
	public Map<String, Object> queryUser(String username, String password) {
		String sql = "select * from user where username=? and password=?";
		Object[] params = new Object[]{username, password};
		return queryOneBySql(sql, params);
	}

}
