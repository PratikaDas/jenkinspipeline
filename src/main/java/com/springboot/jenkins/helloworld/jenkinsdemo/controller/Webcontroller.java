package com.springboot.jenkins.helloworld.jenkinsdemo.controller;

import org.json.JSONException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Webcontroller {

	@RequestMapping(value = "/send", method = RequestMethod.GET)
	public String getHelloJenins() {
		return "Hello Jenkins User";
		
	}

}
