package com.example.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import com.example.api.model.JsonResponseDTO;
import com.example.api.model.ResponseData;

@org.springframework.web.bind.annotation.RestController
@RequestMapping(path = "/api")
public class RestController {

	@Autowired
	RestTemplate restTemplate;

	@GetMapping(path = "/photos")
	public ResponseEntity<ResponseData> callAPI() {
		System.out.println("Inside Call API");
		ResponseData listOfDTO = this.restTemplate.getForObject("https://jsonplaceholder.typicode.com/photos",
				ResponseData.class);
		System.out.println("listOfDTO ==> " + listOfDTO.toString());
		return ResponseEntity.status(202).body(listOfDTO);
	}

}
