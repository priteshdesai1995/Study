package com.example.demo.config;

import org.springframework.stereotype.Component;

@Component
public class Person {
	public String displayMessage() {
		System.out.println("Display Message is called");
		return "Display Message is called";
	}
}
