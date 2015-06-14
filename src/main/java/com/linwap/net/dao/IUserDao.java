package com.linwap.net.dao;

import com.linwap.net.model.User;

/**
 * 用户Dao层
 * @author Lin Xu
 *
 */
public interface IUserDao {
	
	/**
	 * 增加新用户
	 * @param user
	 * @return
	 */
	public int insertUser(User user);
	
}
