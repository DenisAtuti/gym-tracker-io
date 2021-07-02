package com.hashstudio.gymtracker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RestAPIController {
	
	@GetMapping("/")
	public String index() {
		return "I am a Rest API";
	}

}
