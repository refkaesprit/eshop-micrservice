package com.example.ms_authentification.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.ms_authentification.entities.User;
import com.example.ms_authentification.service.UserService;

@RestController
@RequestMapping("/users")
public class UserContoller {
	@Autowired
	private UserService userService;

	/**
	 * Returns a list of all users.
	 *
	 * @return A list of all users.
	 */
	@GetMapping("/list")
	public List<User> getAllUsers() {
		return userService.getAllUsers();
	}

	/**
	 * Returns the user with the specified ID.
	 *
	 * @param id The ID of the user to return.
	 * @return The user with the specified ID, or null if no such user exists.
	 */
	@GetMapping("/list/{id}")
	public Object getUserById(@PathVariable Long id) {
		return userService.getUserById(id);
	}

	/**
	 * Creates a new user.
	 *
	 * @param userEntity The user to create.
	 * @return The newly created user.
	 */
	@PostMapping("/list/create")
	public User createUser(@RequestBody User userEntity) {
		return userService.createUser(userEntity);
	}

	/**
	 * Updates the user with the specified ID.
	 *
	 * @param id         The ID of the user to update.
	 * @param userEntity The new user data.
	 * @return The updated user, or null if no such user exists.
	 */
	@PutMapping("/list/update/{id}")
	public User updateUser(@PathVariable Long id, @RequestBody User userEntity) {
		return userService.updateUser(id, userEntity);
	}

	/**
	 * Deletes the user with the specified ID.
	 *
	 * @param id The ID of the user to delete.
	 */
	@DeleteMapping("/list/delete/{id}")
	public void deleteUser(@PathVariable Long id) {
		userService.deleteUser(id);
	}
	
}
