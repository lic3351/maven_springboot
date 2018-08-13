package com.lic.app.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
	public String sayhi(String s) {
		return "HELLO "+s;
	}
}
