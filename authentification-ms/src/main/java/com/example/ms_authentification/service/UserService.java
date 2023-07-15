package com.example.ms_authentification.service;

import java.util.List;

import com.example.ms_authentification.entities.User;

public interface UserService {
	/**
	 * Retrieve a list of all users in the system.
	 *
	 * @return A List of UserEntity objects representing all users in the system.
	 */
	List<User> getAllUsers();

	/**
	 * Retrieve a user with the specified ID.
	 *
	 * @param id The ID of the user to retrieve.
	 * @return A UserEntity object representing the user with the specified ID, or null if not found.
	 */
	Object getUserById(Long id);

	/**
	 * Create a new user with the specified data.
	 *
	 * @param userEntity A UserEntity object containing the data for the new user.
	 * @return A UserEntity object representing the newly created user.
	 */
	User createUser(User userEntity);

	/**
	 * Update an existing user with the specified data.
	 *
	 * @param id         The ID of the user to update.
	 * @param userEntity A UserEntity object containing the updated data for the user.
	 * @return A UserEntity object representing the updated user, or null if the user was not found.
	 */
	User updateUser(Long id, User userEntity);

	/**
	 * Delete a user with the specified ID.
	 *
	 * @param id The ID of the user to delete.
	 */
	void deleteUser(Long id);
}
