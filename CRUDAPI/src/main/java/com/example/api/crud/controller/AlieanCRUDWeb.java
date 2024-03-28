package com.example.api.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.api.crud.persistance.AlieanServiceImpl;

@Controller
public class AlieanCRUDWeb {

	@Autowired
	AlieanServiceImpl alieanServiceImpl;

	@RequestMapping(path = { "/", "/home" })
	public ModelAndView getHome() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("aliean", alieanServiceImpl.findAll());
		mv.setViewName("index");
		return mv;
	}
}
