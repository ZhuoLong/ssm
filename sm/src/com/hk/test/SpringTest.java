package com.hk.test;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hk.bean.User;
import com.hk.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class SpringTest {
	
	@Autowired
	@Qualifier("userService")
	private UserService userService;
	
	
	@Test
	public void ooooo(){
		User user = new User();
		user.setUsername("zhugan");
		user.setSex(5);
		user.setAge(5);
		user.setBirthday(new Date());
		userService.addUser(user);
	}
}
