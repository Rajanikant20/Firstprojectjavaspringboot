package com.jpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.dao.UserRepo;
import com.jpa.entities.User;

@Service
public class UserService {
	
	@Autowired(required=false)
	private UserRepo repo;
	
	public User saveUser(User user) {
		return repo.save(user);
	}
	
	public List<User> saveUsers(List<User> users) {
		return repo.saveAll(users);
	}
	
	public List<User> getUsers(){
		return repo.findAll();
	}
	
	public User getUserById(int id) {
		return repo.findById(id).orElse(null);
	}
	
	public User getUserByName(String name) {
		return repo.findByName(name);
	}
	
	public String deleteUser(int id) {
		repo.deleteById(id);
		return "User removed :"+id;
	}
	
	public User updateUser(User user) {
		User exuser = repo.findById(user.getId()).orElse(null);
		exuser.setName(user.getName());
		exuser.setCity(user.getCity());
		exuser.setState(user.getState());
		return repo.save(exuser);
	}
}
