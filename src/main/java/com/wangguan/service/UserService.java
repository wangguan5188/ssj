package com.wangguan.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wangguan.dao.UserDao;

@Service
public class UserService {

	@Autowired
	private UserDao userDao;
	
	public Map<String, Object> queryUser(String username, String password) {
		return userDao.queryUser(username, password);
	}
	
}
