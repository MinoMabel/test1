package com.sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sample.model.LoginBean;

@Controller
public class SampleController {

	@RequestMapping("/")
	public String index()
	{
		return "index";
	}
	
	@RequestMapping("/homelogin")
	public String homelogin()
	{
		return "redirect:/1";
	}
	
	@RequestMapping("/1")
	public String one()
	{
		return "Login";
	}
	
	@RequestMapping("/homesignup")
	public String homesignup()
	{
		return "redirect:/2";
	}
	
	@RequestMapping("/2")
	public String two()
	{
		return "Signup";
	}
	
	@RequestMapping("/login")
	public String login()
	{
		return "Page1";
	}
	
	@RequestMapping("/signup")
	public String signup(@ModelAttribute("usign") LoginBean usign)
	{
		if(usign.getUpass().equals("admin")&&usign.getUcpass().equals("admin"))
		{
			return "Page1";
		}
		else
		{
			return "Signup";
		}
	}
	
	@RequestMapping("/logout")
	public String logout()
	{
		return "index";
	}
}
