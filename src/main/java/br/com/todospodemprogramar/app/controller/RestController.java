package br.com.todospodemprogramar.app.controller;
import org.springframework.http.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


import br.com.todospodemprogramar.app.model.User;
import br.com.todospodemprogramar.app.services.UserService;

/**
 * Created by Natalia Rosa on 08/07/19.
 */
@org.springframework.web.bind.annotation.RestController
@RequestMapping(path = "/api", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
public class RestController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/x")
	public ResponseEntity<User> saveUser(@RequestBody User user) throws Exception {
		return ResponseEntity.ok(userService.save(user));
	}
	
	
	@PutMapping("/user/{id}")
	public ResponseEntity<User> updateUser(@RequestBody User user, @PathVariable int id) throws Exception{
		user.setId(id);
		return ResponseEntity.ok(userService.save(user));
	}
}
