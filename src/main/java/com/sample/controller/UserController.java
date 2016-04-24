package com.sample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sample.domain.User;
import com.sample.service.UserService;

@Controller
public class UserController {
	
	//Injecting User Service
	@Autowired
	UserService service;
	
	//Views
	private final String REG_LIST = "form_list";
	private final String REG_POST = "form_result";
	
	@RequestMapping(value="/list")
	public ModelAndView showRegistrationList(){
		ModelAndView mav = new ModelAndView(REG_LIST, "user", new User());		
		mav.addObject("countries", service.getCountries());		
		return mav;		
	}
	
	//Add binding result to ensure that we validate all of the User fields based on any
	//field annotation declared in the com.sample.bean.User class.
	@RequestMapping(value="/result")
	public ModelAndView postRegistrationList(User user, BindingResult binding){
		return new ModelAndView(REG_POST, "user", user);
	}
}
