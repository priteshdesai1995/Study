package com.springcore.auto.wire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoMainType {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/auto/wire/autowireconfigType.xml");
		Employee emp = context.getBean("employee",Employee.class);
		System.out.println(emp);
		

	}

}
