package com.huawei;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class HelloMvcControler {
	
	
    @RequestMapping("/mvc")
	public String helloMvc(){
		return "home";
	}
}
