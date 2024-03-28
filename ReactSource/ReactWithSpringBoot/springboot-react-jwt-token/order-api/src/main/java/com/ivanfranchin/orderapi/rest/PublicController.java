package com.ivanfranchin.orderapi.rest;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ivanfranchin.orderapi.service.OrderService;
import com.ivanfranchin.orderapi.service.UserService;

import lombok.RequiredArgsConstructor;

@CrossOrigin("*")	
@RequiredArgsConstructor
@RestController
@RequestMapping("/public")
public class PublicController {

	private final UserService userService;
	private final OrderService orderService;

	@GetMapping("/numberOfUsers")
	public Integer getNumberOfUsers() {
		return userService.getUsers().size();
	}

	@GetMapping("/numberOfOrders")
	public Integer getNumberOfOrders() {
		return orderService.getOrders().size();
	}
}
