package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dto.Student;
import com.example.demo.persistence.StudentServiceImpl;

@Controller
public class StudentController {

	@Autowired
	private StudentServiceImpl studentServiceImpl;

	@RequestMapping(value = { "/", "/home" })
	public ModelAndView Home(Student student) {
		System.out.println("Name is : " + student.getName());

		List<Student> studentList = (List<Student>) studentServiceImpl.findAll();
		System.out.println("Student List ==> " + studentList.toString());
		ModelAndView mv = new ModelAndView();
		mv.addObject("student", student);
		mv.addObject("studentList", studentList);
		mv.addObject("isUpdate", "false");
		mv.setViewName("home");
		return mv;
	}

	@RequestMapping("addStudent")
	public ModelAndView AddStudent(Student student) {
		System.out.println("Name is : " + student.toString());

		studentServiceImpl.save(student);

		List<Student> studentList = (List<Student>) studentServiceImpl.findAll();
		ModelAndView mv = new ModelAndView();
		mv.addObject("student", student);
		mv.addObject("studentList", studentList);
		mv.addObject("isUpdate", "false");
		mv.setViewName("home");
		return mv;
	}

	@RequestMapping("editForm")
	public ModelAndView FetchStudentById(@RequestParam("id") int id) {

		Student student = studentServiceImpl.findById(id).orElse(null);

		List<Student> studentList = (List<Student>) studentServiceImpl.findAll();
		ModelAndView mv = new ModelAndView();
		mv.addObject("student", student);
		mv.addObject("studentList", studentList);
		mv.addObject("isUpdate", "true");
		mv.setViewName("home");
		return mv;
	}

	@RequestMapping("edit")
	public ModelAndView EditStudent(Student student) {

		Student student1 = studentServiceImpl.findById(student.getId()).orElse(null);

		if (student1 != null) {
			student1.setEmail(student.getEmail());
			student1.setName(student.getName());
			student1.setPhoneNumeber(student.getPhoneNumeber());
		}
		studentServiceImpl.save(student1);
		
		
		List<Student> studentList = (List<Student>) studentServiceImpl.findAll();
		ModelAndView mv = new ModelAndView();
		mv.addObject("student", student);
		mv.addObject("studentList", studentList);
		mv.addObject("isUpdate", "false");
		mv.setViewName("home");
		return mv;
	}

	@RequestMapping("delete")
	public ModelAndView DeleteStudent(@RequestParam("id") int id) {

		studentServiceImpl.deleteById(id);

		List<Student> studentList = (List<Student>) studentServiceImpl.findAll();
		ModelAndView mv = new ModelAndView();
		mv.addObject("studentList", studentList);
		mv.addObject("isUpdate", "false");
		mv.setViewName("home");
		return mv;
	}
}
