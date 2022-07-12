package com.sample.Demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/start")
public class HelloWorldController 
{
	@GetMapping("/hello")
	public String hello() {
		return "hello world 2";
	}
}
