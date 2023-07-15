package com.example.ms_authentification.entities;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name="users")
public class User{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;


	@Column(name = "first_name")
	private String Name;
	@Column(name = "last_name")
	private String lastName;
	@Column(name = "cin")
	private String cin;
	@Column(name = "code")
	private String code;

	/**
	 * email
	 */
	private String email;

	/**
	 * password
	 */
	private String password;

	public User(String firstName, String lastName, String email) {
		this.Name=firstName;
		this.lastName=lastName;
		this.email=email;
	}

	/**
	 * username
	 */

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCin() {
		return cin;
	}

	public void setCin(String cin) {
		this.cin = cin;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * lis of roles
	 */
	public static String hashPassword(String password) {
		try {
			MessageDigest md = MessageDigest.getInstance("SHA-256");
			byte[] hashedPassword = md.digest(password.getBytes(StandardCharsets.UTF_8));
			return Base64.getEncoder().encodeToString(hashedPassword);
		} catch (NoSuchAlgorithmException e) {
			throw new RuntimeException("Error hashing password", e);
		}
	}

	public String getFirstName() {
		// TODO Auto-generated method stub
		return null;
	}


}
