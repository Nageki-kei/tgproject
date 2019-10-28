  
package com.teknoglobal.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;




import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teknoglobal.exception.ResourceNotFoundException;
import com.teknoglobal.model.Users;
import com.teknoglobal.repository.UsersRepository;

@RestController
@RequestMapping("/api/v9")
public class UsersController {
	@Autowired
	private UsersRepository usersRepository;

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	
	@CrossOrigin
	@GetMapping("/users")
	public List<Users> getAllUsers() {
		return usersRepository.findAll();
	}
	
	//TEST
	@CrossOrigin
	@GetMapping("/login/{email}/{password}")
	public ResponseEntity<Users> getUserByEmailAndPassword(@PathVariable(value = "email") String email, @PathVariable(value = "password") String password)
			throws ResourceNotFoundException {
		Users users = usersRepository.findByEmailAndPassword(email, password);
		return ResponseEntity.ok().body(users);
	}



	
	@CrossOrigin
	@GetMapping("/users/{id}")
	public ResponseEntity<Users> getUsersById(@PathVariable(value = "id") Long usersId)
			throws ResourceNotFoundException {
		Users users = usersRepository.findById(usersId)
				.orElseThrow(() -> new ResourceNotFoundException("Users not found for this id :: " + usersId));
		return ResponseEntity.ok().body(users);
	}
	
	@CrossOrigin
	@PostMapping("/users")
	public Users createUsers(@Valid @RequestBody Users users) {


		// test enskripsi password

		String password=users.getPassword(); 		
		String encryptPwd = passwordEncoder.encode(password);
		users.setPassword(encryptPwd);
		// SET ROLE 
		users.setRole("customer");
		return usersRepository.save(users);
	}
	
	@CrossOrigin
	@PutMapping("/users/{id}")
	public ResponseEntity<Users> updateUsers(@PathVariable(value = "id") Long usersId,
			@Valid @RequestBody Users usersDetails) throws ResourceNotFoundException {
		Users users = usersRepository.findById(usersId)
				.orElseThrow(() -> new ResourceNotFoundException("Users not found for this id :: " + usersId));

		users.setEmail(usersDetails.getEmail());
		users.setLastName(usersDetails.getLastName());
        users.setFirstName(usersDetails.getFirstName());
        users.setEmail(usersDetails.getEmail());
		users.setPassword(usersDetails.getPassword());
		users.setRole(usersDetails.getRole());
		final Users updatedUsers = usersRepository.save(users);
		return ResponseEntity.ok(updatedUsers);
	}
	
	@CrossOrigin
	@DeleteMapping("/users/{id}")
	public Map<String, Boolean> deleteUsers(@PathVariable(value = "id") Long usersId)
			throws ResourceNotFoundException {
		Users users = usersRepository.findById(usersId)
				.orElseThrow(() -> new ResourceNotFoundException("Users not found for this id :: " + usersId));

		usersRepository.delete(users);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}
}