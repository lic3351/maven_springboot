package com.lic.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lic.app.service.HelloService;

@Controller
public class HelloController {
	@Autowired
	private HelloService helloService;
	@RequestMapping("/hi")
	@ResponseBody
	public String hi(String name) {
		String rs=helloService.sayhi(name);
		return rs;
	}
	@RequestMapping("/index")
	public String s() {
		return "pages/index";
	}
}
