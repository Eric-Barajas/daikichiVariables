package com.ericbarajas.daikichivariables.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
//	Have an http GET request to 'http://localhost:8080/daikichi
//	' display text that says 'Welcome!'
	@RequestMapping(value="/daikichi", method=RequestMethod.GET)
	public String index() {
		return "Welcome!";
	}
	
//	Have an http GET request to 'http://localhost:8080/daikichi/today' 
//	display text that says 'Today you will find luck in all your endeavors!'
	@RequestMapping("/daikichi/today")
	public String fortune() {
		return "Today you will find luck in all your endeavors!";
	}
	
//	Have an http GET request to 'http://localhost:8080/daikichi/tomorrow' 
//	display text that says 'Tomorrow, an opportunity will arise, 
//	so be sure to be open to new ideas!'
	@RequestMapping("/daikichi/tomorrow")
	public String fortune2() {
		return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
	}
	
	
	
//	Add 2 new routes with corresponding method definitions in your Daikichi 
//	Routes project that will accept path variables.
	
//	Have an http GET request to 'http://localhost:8080/daikichi/travel/kyoto' 
//	where the url will take any string for the city, and display text that says 
//	for example, 'Congratulations! You will soon travel to kyoto!'.
	@RequestMapping("/daikichi/travel/{city}")
	public String travel(@PathVariable("city") String city) {
		return "Congratulations! You will soon travel to " + city + "!";
	}
	
//	Have an http GET request to 'http://localhost:8080/daikichi/lotto/8', 
//	where the url will take any integer. If the number is even, display text 
//	that says 'You will take a grand journey in the near future, 
//	but be weary of tempting offers'. If it is odd, display text that says 
//	"You have enjoyed the fruits of your labor but now is a great time to spend "
//	+ "time with family and friends."
	@RequestMapping("/daikichi/lotto/{number}")
	public String fortuneWarning(@PathVariable("number") int number) {
		if (number % 2 == 0) {
			return "You will take a grand journey in the near future, but be weary of tempting offers";
		}
		else
			return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
		
	}

}
