package com.example.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.student.model.Student;
import com.example.student.persistance.StudentServiceImpl;

@RestController
@RequestMapping("/student")
public class StrudentController {

	@Autowired
	private StudentServiceImpl studentServiceImpl;

	@GetMapping("/{userId}")
	public Student getStudentById(@PathVariable("userId") Integer userId) {
		System.out.println("UserId is ==> " + userId);
		Student student = studentServiceImpl.findById(userId).orElse(new Student());
		System.out.println("student is ==> " + student.toString());
		return student;
	}

	@GetMapping("/test")
	public String getTest() {
		return "test";
	}
}
