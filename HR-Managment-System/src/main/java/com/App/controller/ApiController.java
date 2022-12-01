package com.App.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ApiController {


	@RequestMapping("/")
	public String home()
	{
		return "index.html";
	}
	
	@RequestMapping("/dashboard")
	public String mainMenu()
	{
		return "dashboard.html";
	}
}
