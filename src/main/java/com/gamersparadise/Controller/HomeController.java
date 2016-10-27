package com.gamersparadise.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController 
{
	@RequestMapping("/home")
	public String Home() 
	{
		return "Home";
	}
	
	@RequestMapping("/about-us")
	public String AboutUs()
	{
		return "AboutUs";
	}
	
	@RequestMapping("/contact")
	public String Contact()
	{
		return "Contact";
	}
}