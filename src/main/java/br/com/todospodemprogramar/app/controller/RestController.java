package br.com.todospodemprogramar.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.com.todospodemprogramar.app.model.User;
import br.com.todospodemprogramar.app.services.UserService;

/**
 * Created by Natalia Rosa on 08/07/19.
 */
@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/user")
	public String saveUser(@RequestBody String username, @RequestBody String name, @RequestBody String experience, @RequestBody String hobby, @RequestBody String contact, @RequestBody String password) {
		User user = new User(username, name, experience, hobby, contact, password);
		userService.saveMyUser(user);
		return "User Saved";
	}
}
