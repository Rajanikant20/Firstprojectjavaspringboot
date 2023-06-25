package com.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.entities.User;
import com.jpa.service.UserService;

@RestController
public class UserController {
	
	@Autowired(required = false)
	private UserService service;
	
	@PostMapping(value="/addUser")
	public User addUser(@RequestBody User user) {
		return service.saveUser(user);
		
	}
	@PostMapping(value="/addUsers")
	public List<User> addUsers(@RequestBody List<User> users) {
		return service.saveUsers(users);
		
	}
	
	@GetMapping(value="/users")
	public List<User> findAllUsers(){
		return service.getUsers();
	}
	
	@GetMapping(value="/userbyid/{id}")
	public User findUserById(@PathVariable int id) {
		return service.getUserById(id);
	}
	
	@GetMapping(value="/user/{name}")
	public User findUserByName(@PathVariable String name) {
		return service.getUserByName(name);
	}
	
	@PutMapping(value="/updateUser")
	public User updateUser(@RequestBody User user) {
		return service.updateUser(user);
		
	}
	
	@DeleteMapping(value="/delete/{id}")
	public String deleteUser(@PathVariable int id) {
		return service.deleteUser(id);
		
	}
	
}
