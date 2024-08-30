package com.wipro.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	@GetMapping("/home")
	public String home()
	{
		return "welcome to wipro";
	}
	
	@GetMapping("/balance")
	public String getBalance()
	{
		return "your current balance is" + 12345;
	}
	
	@GetMapping("/statement")
	public String getStatement()
	{
		return "your statement genarated and send it to your mail";
	}
	
	@GetMapping("/loan")
	public String getLoan()
	{
		return "your loan amount is:1,23,456";
	}
	
	@GetMapping("/contact")
	public String getContact()
	{
		return "welcome to wipro";
	}
}
