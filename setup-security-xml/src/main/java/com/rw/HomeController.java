package com.rw;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	/*@RequestMapping(value="/")
	public String index(){
		return "welcome";
	}*/
	
	@RequestMapping(value = {"/","/welcome"})
	public String index(){
		return "welcome";
	}
	
	@RequestMapping(value="/courses")
	public String courses(){
		return "courses";
	}
	
	@RequestMapping(value="/login")
	public String login(){
		return "login";
	}
}
