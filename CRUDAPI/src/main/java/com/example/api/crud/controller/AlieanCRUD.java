package com.example.api.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.api.crud.model.Aliean;
import com.example.api.crud.persistance.AlieanServiceImpl;

@RestController
@RequestMapping("/aliean")
public class AlieanCRUD {

	@Autowired
	AlieanServiceImpl alieanServiceImpl;

	@GetMapping(path = "/allAliean")
	public ResponseEntity<Iterable<Aliean>> getAllAliean() {
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(alieanServiceImpl.findAll());
	}

	@PostMapping(path = "/addAliean")
	public ResponseEntity<Aliean> addAliean(@RequestBody Aliean aliean) {
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(alieanServiceImpl.save(aliean));
	}

	@PostMapping(path = "/addAlieans")
	public ResponseEntity<Iterable<Aliean>> addAliean(@RequestBody List<Aliean> aliean) {
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(alieanServiceImpl.saveAll(aliean));
	}
}
