package com.example.ms_authentification.service;

import java.util.List;

import com.example.ms_authentification.repository.UserRepsitory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import com.example.ms_authentification.entities.User;


@Service
//@Transactional
@Slf4j
public class UserServiceImpl implements UserService {

	private UserRepsitory userRepository;

	@Override
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	@Override
	public Object getUserById(Long id) {
		return userRepository.findAllById(id).orElse(null);
	}

	@Override
	public User createUser(User user) {
		user.setCode(user.getFirstName() + "-" + user.getLastName() + "-" + user.getClass());
		user.setPassword(User.hashPassword(user.getCin()));
		return userRepository.save(user);    }



	@Override
	public User updateUser(Long id, User userEntity) {
		User existingUserEntity = userRepository.findById(id.intValue()).orElse(null);
		if (existingUserEntity != null) {
			existingUserEntity.setName(userEntity.getFirstName());
			existingUserEntity.setLastName(userEntity.getLastName());
			existingUserEntity.setCin(null);
			existingUserEntity.setCode(userEntity.getFirstName() + "-" + userEntity.getLastName() + "-" + userEntity.getClass());
			existingUserEntity.setEmail(userEntity.getEmail());
			existingUserEntity.setPassword(User.hashPassword(userEntity.getPassword()));
			return userRepository.save(existingUserEntity);
		}
		return null;
	}

	@Override
	public void deleteUser(Long id) {
		userRepository.deleteById(id.intValue());

	}
}
