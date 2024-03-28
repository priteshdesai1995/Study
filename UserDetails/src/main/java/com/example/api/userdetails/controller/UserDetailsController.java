package com.example.api.userdetails.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.api.userdetails.mode.UserDetails;
import com.example.api.userdetails.presistance.UserServiceImpl;

@RestController
public class UserDetailsController {

	@Autowired
	private UserServiceImpl userserviceImpl;

	@PostMapping("/adduser")
	public ResponseEntity<UserDetails> addUser(@Valid UserDetails userDetails, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(userDetails);
		}
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(userserviceImpl.save(userDetails));
	}
}
