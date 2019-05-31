package com.assessment.cib.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.assessment.cib.model.*;

@RestController
public class TaskTwoCtr {

	
	@PostMapping("/add/user")
	@ResponseBody
	public String addUser(@RequestBody User user){
		return "User added";
	}
}
