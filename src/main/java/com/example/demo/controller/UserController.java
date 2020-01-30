package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.example.demo.dao.UserRepo;
import com.example.demo.model.User;
import java.util.List;

@Controller
public class UserController {
	@Autowired
	UserRepo repo;

	@PostMapping("/Signup")
	@ResponseBody
	public String addUser(@RequestBody User user1) {
		String message;
		List<User> user=repo.findByUsername(user1.getUser_name());
		if(user.size()==0){
			repo.save(user1);
			message="User saved";
		}
		
		else
			message="Login!! User already exists";
		return message;
		
	}
	
	@PostMapping("/Login")
	@ResponseBody
	public String getUser(@RequestBody User user1) {
		String message;
		List<User> user=repo.findByUsername(user1.getUser_name());
		if(user.size()==0)
			message="Invalid User";
		else if(!user.get(0).getPassword().equals(user1.getPassword()))
			message="Invalid Password";
		else
			message="Welcome";
		return message;
	}

}
