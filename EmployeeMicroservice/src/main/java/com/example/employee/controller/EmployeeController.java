package com.example.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.employee.model.Contact;
import com.example.employee.model.Employee;
import com.example.employee.persistance.EmployeeServiceImpl;

@RestController
@RequestMapping(path = "/employee")
public class EmployeeController {

	@Autowired
	RestTemplate restTemplateConfiguration;

	@Autowired
	EmployeeServiceImpl employeeServiceImpl;

	@GetMapping(path = "/{empId}")
	public Employee getEmployeeById(@PathVariable("empId") Long empId) {
		System.out.println("***** EmployeeId is : " + empId);

		Contact contact = this.restTemplateConfiguration.getForObject("http://CONTACT-SERVICE/contact/1", Contact.class);
		System.out.println("Contact Model is ==> " + contact.toString());
		return employeeServiceImpl.findById(empId).orElse(null);
	}
}
