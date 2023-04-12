package com.example.demo5.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo5.dto.User;


@RestController
@RequestMapping("/api")
public class ApiController {

	
	@PostMapping("/user2")
	public ResponseEntity<User> user(@RequestBody User user){
		if(user.getAge() < 1 || user.getAge() > 100) {
			
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(user);
		}
		System.out.println(user);
		return ResponseEntity.ok(user);
	}
}
