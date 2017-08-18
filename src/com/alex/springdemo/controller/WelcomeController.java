package com.alex.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alex.service.demo.GenericWelcomeService;
import com.alex.service.demo.WelcomeService;

@Controller
public class WelcomeController {
	
	@Autowired
	private GenericWelcomeService welcomeService; 
	
	@RequestMapping("/")
	// http://localhost:8080/spring-mvc-demo-1/
	public String doWelcome(Model model) {
		
		//1. Retrieve the process data 
		//WelcomeService welcomeService = new WelcomeService(); 
		List<String> welcomeMessage = welcomeService.getWelcomeMessage("Alex Trzeciak");

		// 2. Add data to model 
		model.addAttribute("myWelcomeMessage", welcomeMessage);
		
		// 3. Return logical view name 
		return "welcomeNew"; 
	}
	
}

// requests will be routed with servlet from this controller since @controller added 
// define doWelcome as handler method 
// all requests to app that have / will be routed to this method 