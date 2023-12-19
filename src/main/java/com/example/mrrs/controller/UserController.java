package com.example.mrrs.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mrrs.entity.User;

@RestController
@RequestMapping("/user")
public class UserController {

	@GetMapping("/saveUser")
	public ResponseDto saveUser(@RequestBody User user){
		
	}
	
}
