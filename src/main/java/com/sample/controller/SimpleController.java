package com.sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SimpleController {

	@RequestMapping(value="/hello")
	public ModelAndView sayHello(){
		//message is model alias, Hey there is the value, hello is the view
		System.out.println("Hello method hit");
		return new ModelAndView( "hello", "message", "Hello from the Annotation Based Configuration");
	}
}
