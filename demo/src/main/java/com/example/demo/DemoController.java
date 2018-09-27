package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/MyTest")
public class DemoController {
	@Value("${xyt.name}")
	private String myname;
	@RequestMapping("/hello")
	public String hello() {
		return myname+"Hello World!";
	}
}
