package com.sample.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.sample.dao.UserDao;
import com.sample.dao.UserDaoInMemoryImpl;
import com.sample.service.UserService;
import com.sample.service.UserServiceImpl;

@Configuration
@EnableWebMvc //This annotation allows for Validation via annotated fields on domain objects
@Import({ServicesConfig.class, DaoConfig.class})
@ComponentScan(basePackages = {"com.sample.controller"})
public class AppConfig extends WebMvcConfigurerAdapter{

		@Bean
		public InternalResourceViewResolver getInternalResourceViewResolver(){
			InternalResourceViewResolver rvr = new InternalResourceViewResolver();
			rvr.setPrefix("/WEB-INF/views/");
			rvr.setSuffix(".jsp");
			
			return rvr;
		}
		
		@Override
		public Validator getValidator(){
			//Spring factory method that returns the static bean with all of the property bundles
			LocalValidatorFactoryBean validator = new LocalValidatorFactoryBean();
			//Spring managed bean that holds reference to the specific property file
			ReloadableResourceBundleMessageSource msg = new ReloadableResourceBundleMessageSource(); 
			
			msg.setBasename("classpath:messages");	
			validator.setValidationMessageSource(msg);
			
			return validator;
		}
}
