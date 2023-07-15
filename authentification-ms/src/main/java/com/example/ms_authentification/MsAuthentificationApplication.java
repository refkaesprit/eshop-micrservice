package com.example.ms_authentification;

import com.example.ms_authentification.entities.User;
import com.example.ms_authentification.repository.UserRepsitory;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
@EnableDiscoveryClient
public class MsAuthentificationApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsAuthentificationApplication.class, args);
	}
//
//	@Bean
//	ApplicationRunner start(UserRepsitory repo) {
//		return
//				args -> {
//					Stream.of(new User("Manel", "Hamrouni", "manel.hamrouni@esprit.tn"),
//
//									new User("Ahmed", "Mrabet", "ahmed@gmail.com"))
//							.forEach(
//									user -> {
//										repo.save(user);
//									});
//					repo.findAll().forEach(System.out::println);
//				};
//	}
}




