package com.s3cubesystems.usermanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.s3cubesystems.usermanagement.config.UserConfiguration;
import com.s3cubesystems.usermanagement.model.User;

/**
 * this class which handle request for for user-management service this class is
 * controller class
 */

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserConfiguration configuration;
	
	@GetMapping(value = "/getByid")
	public User getUserDeatails() {
		
		return new User(configuration.getUserid(),configuration.getFirstName(), configuration.getLasttName(),configuration.getUserEmail(), configuration.getUserPassword());
	}

}
