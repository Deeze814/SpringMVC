package com.sample.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

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
}
