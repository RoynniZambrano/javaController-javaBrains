package io.javabrains.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	//GET 
	@RequestMapping(value = "/v1/hello", method = RequestMethod.GET, headers = "Accept=application/json")
	public String sayHi() {
		return "Hi-hi";
	}
	

}
