package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.config.Person;
import com.example.demo.model.Student;

@SpringBootApplication
public class SpringDemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringDemoApplication.class, args);
		Student student = applicationContext.getBean(Student.class);
		System.out.println("Inside the SpringDemoApplication = " + student.displayMessage());

		Person person = applicationContext.getBean(Person.class);
		System.out.println(person.displayMessage());
	}

}
