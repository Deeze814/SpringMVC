package com.sample.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sample.dao.UserDao;
import com.sample.dao.UserDaoInMemoryImpl;

@Configuration
public class DaoConfig {
	
	//Provides the user data access object
	@Bean
	public UserDao userDao(){
		return new UserDaoInMemoryImpl();
	}
}
