package com.martscompany.restapi.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.martscompany.restapi.entity.User;
import com.martscompany.restapi.interfaces.UserRepository;

@RestController
@RequestMapping(path="/user")
public class UserController {

	
	@Autowired
	private UserRepository repo;
	
	@PostMapping("/add")
	public User add(@RequestBody User val) {
		return repo.save(val);
	}
	
	@GetMapping("/views")
	public List<User> views(){
		return repo.findAll();
	}
	
	@GetMapping("/views/{val}")
	public Optional<User> views(@PathVariable Integer val){
		return repo.findById(val);
	}
	
	@PutMapping("/update")
	public User views(@RequestBody User val){
		return repo.save(val);
	}
	
	@DeleteMapping("/delete/{val}")
	public String delete(@PathVariable Integer val){
	   repo.deleteById(val);
	   return "Id : " +val+ " delete";
	}
}
