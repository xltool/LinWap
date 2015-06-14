package com.linwap.net.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.linwap.net.model.User;
import com.linwap.net.service.IUserService;

public class UserTest {
	
	private IUserService userService;
    
    @Before
    public void before(){                                                                    
        @SuppressWarnings("resource")
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:conf/spring-service.xml"
                ,"classpath:conf/spring-mybatis.xml"});
        userService =  (IUserService) context.getBean("userServiceImpl");
    }
     
    @Test
    public void addUser(){
        User user = new User();
        	user.setUsername("xulin02");
        	user.setPassword("123456");
        System.out.println(userService.insertUser(user));
    }
	

}
