package com.linwap.net.service;

import com.linwap.net.model.User;

/**
 * 新增用户服务层
 * @author Lin Xu
 * @data 
 */
public interface IUserService {
	
	/**
	 * 增加新用户
	 * @param user
	 * @return
	 */
	public int insertUser(User user);
}
