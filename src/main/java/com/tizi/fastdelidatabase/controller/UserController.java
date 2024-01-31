
package com.tizi.fastdelidatabase.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tizi.fastdelidatabase.service.UserService;
import com.tizi.fastdelidatabase.entity.UserEntity;
import com.tizi.fastdelidatabase.model.User;


@RestController
@CrossOrigin(origins = "+")
@RequestMapping("/api/users")
public class UserController {
	@Autowired
	UserService userService;
	
	@RequestMapping(value = "/getAllUsers", method = RequestMethod.GET)
	public List<User> getAllUsers() {
		return userService.getAllUsers();
	}
	
	@RequestMapping(value = "/addUser", method = RequestMethod.POST)
	public String addUser(@RequestBody UserEntity user) {
	    return userService.addUser(user);
	}

	@RequestMapping(value = "/updateUser", method = RequestMethod.PUT)
	public String updateUser(@RequestBody UserEntity user) {
		return userService.updateUser(user);
			
	}
	
	@RequestMapping(value = "/deleteUser", method = RequestMethod.DELETE)
	public String deleteUser(@RequestBody UserEntity user) {
		return userService.removeUser(user);
			
	}	
}
