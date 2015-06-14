package com.linwap.net.model;

import java.io.Serializable;

/**
 * 用户对象
 * @author Lin Xu
 * @data 2015-6-14
 */
public class User implements Serializable{

	private static final long serialVersionUID = -6611365667685006632L;
	//主键id
	private Integer id;
	//用户名
	private String username;
	//密码
	private String password;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
