package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Appconfigration {
@RequestMapping("/hello")
	public String Hello() {
		return "This is my firts Spring Applcations";
	}
}
