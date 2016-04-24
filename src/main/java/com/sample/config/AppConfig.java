package com.sample.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.sample.dao.UserDao;
import com.sample.dao.UserDaoInMemoryImpl;
import com.sample.service.UserService;
import com.sample.service.UserServiceImpl;

@Configuration
@ComponentScan(basePackages = {"com.sample.controller"})
public class AppConfig {

		@Bean
		public InternalResourceViewResolver getInternalResourceViewResolver(){
			InternalResourceViewResolver rvr = new InternalResourceViewResolver();
			rvr.setPrefix("/WEB-INF/views/");
			rvr.setSuffix(".jsp");
			return rvr;
		}
		
		@Bean
		public UserService userService(){
			return new UserServiceImpl();
		}
		
		@Bean
		public UserDao userDao(){
			return new UserDaoInMemoryImpl();
		}		
}
