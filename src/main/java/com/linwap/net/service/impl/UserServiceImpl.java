package com.linwap.net.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.linwap.net.dao.IUserDao;
import com.linwap.net.model.User;
import com.linwap.net.service.IUserService;

/**
 * 用户服务层
 * @author Lin Xu
 * @data 2015-6-14 22:27:55
 */

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private IUserDao userDao;
	
	@Override
	public int insertUser(User user) {
		return userDao.insertUser(user);
	}

}
