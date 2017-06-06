package com.kayvee.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GreetingController {
	
	
	@RequestMapping("/greeting")
	@ResponseBody
	public String greeting(String name) {
		return "Hello "+name;
		
	}

	@RequestMapping("/")
	@ResponseBody
	public String hello() {
		return "Hello User";
	}

}
