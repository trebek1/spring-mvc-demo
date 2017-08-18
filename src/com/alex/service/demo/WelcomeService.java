package com.alex.service.demo;

import java.util.ArrayList;
import java.util.List;

public class WelcomeService implements GenericWelcomeService{
	// business logic should be done in a service layer and 
	// passed back to the controller (not coded in the controller) 
	
	public List<String> getWelcomeMessage(String name){
		List<String> myWelcomeMessage = new ArrayList<>();
		myWelcomeMessage.add("Hello "); 
		myWelcomeMessage.add(name); 
		myWelcomeMessage.add(", welcome to the Spring course :-)"); 
		return myWelcomeMessage; 
	}
}
