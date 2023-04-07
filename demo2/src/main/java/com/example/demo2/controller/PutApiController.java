package com.example.demo2.controller;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo2.model.PostRquestDto;
import com.example.demo2.model.PutRquestDto;

@RestController
@RequestMapping("/api")
public class PutApiController {

	// METHOD : PUT
	// http://localhost:8080/api/put1
	@PutMapping("/put1")
	public PostRquestDto put(@RequestBody PostRquestDto req) {
		System.out.println("req : " + req);
		return req;
		
	}
	
	// METHOD : PUT
	// http://localhost:8080/api/put2
	@PutMapping("/put2")
	public PutRquestDto put2(@RequestBody PutRquestDto reqdto) {
		System.out.println("req : " + reqdto);
		return reqdto;
		
	}
}
