package com.sample.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sample.domain.User;
import com.sample.enums.Enums;
import com.sample.service.UserService;

@Controller
public class UserController {
	
	//Injecting User Service
	@Autowired
	UserService service;
	
	//Views
	private final String LIST = "form_list";
	private final String RESULT = "form_result";
	
	@RequestMapping(value="/list")
	public ModelAndView showRegistrationList(){
		ModelAndView mav = new ModelAndView(LIST, "user", new User());		
		mav.addObject("countries", service.getCountries());
		mav.addObject("genders", Enums.Genders.values());
		return mav;		
	}
	
	//Add binding result to ensure that we validate all of the User fields based on any
	//field annotation declared in the com.sample.bean.User class.
	@RequestMapping(value="/result", method=RequestMethod.POST)
	public ModelAndView postRegistrationList(@Valid User user, BindingResult result){
		ModelAndView mav = new ModelAndView(RESULT, "user", user);
		
		if(result.hasErrors())
		{
			mav.setViewName(LIST);
			mav.addObject("countries", service.getCountries());
			mav.addObject("genders", Enums.Genders.values());
		}
		
		return mav;
		
	}
}
