package com.ms1.SocialMedia.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.ms1.SocialMedia.bean.Users;
import com.ms1.SocialMedia.service.UserServiceImpl;

@RestController
public class Controller {
	@Autowired
	UserServiceImpl service;
	
	@GetMapping("/user")
	public List<Users> getAll(){
		return service.findAll();
	}
	@GetMapping("/user/{id}")
	public Users getById(@PathVariable Integer id){
		return service.findOne(id);
	}
	
	@PostMapping("/user")
	public ResponseEntity<Users> save(@RequestBody Users user){
		Users newUser= service.save(user);
		URI location=ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(newUser.getId()).toUri();
		return ResponseEntity.created(location).build();
	}
	
}
