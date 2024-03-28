package com.example.demo.config;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class AspectHelper {
	@Before("execution(public String displayMessage())")
	public void log() {
		System.out.println("Log method is called");
	}

	@After("execution(public String displayMessage())")
	public void Security() {
		System.out.println("Security method is called");
	}
}
