package com.linwap.net.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.linwap.net.model.User;
import com.linwap.net.service.IUserService;

/**
 * 测试controller层访问
 * @author Lin Xu
 * @date 2015年6月14日 19:36:31
 */
@Controller
@RequestMapping("/TestController")
public class TestController {
	Logger logger = Logger.getLogger(TestController.class);
			
	@Autowired
	private IUserService userService;
	
	
	@RequestMapping("/navigation")
	public String navigation(){
		User user = new User();
    	user.setUsername("xulin02");
    	user.setPassword("123456");
    	logger.info("插入返回值：" + userService.insertUser(user));
		return "success";
	}

}
