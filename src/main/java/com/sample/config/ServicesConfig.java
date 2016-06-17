package com.sample.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sample.service.UserService;
import com.sample.service.UserServiceImpl;

@Configuration
public class ServicesConfig {
	
	//Provides the user service 
	@Bean
	public UserService userService(){
		return new UserServiceImpl();
	}
}
