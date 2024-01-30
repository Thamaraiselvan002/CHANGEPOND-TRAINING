package com.app.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
public class MyRestController {
	@Value("${trainer.name}")
	private String name;
	@Value("${trainer.sub}")
	private String sub;
	
	
	
	@GetMapping("index")
	public String index() {
		return "payilagam";
		
	}
	@GetMapping("/")
	public String SayHello() {
		return "hello world";
	}
	
	@GetMapping("/info")
	public String info() {
		return "name is "+name +"  learning language is " +sub;
	}
}
