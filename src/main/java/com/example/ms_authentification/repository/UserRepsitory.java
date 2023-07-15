package com.example.ms_authentification.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ms_authentification.entities.User;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface UserRepsitory extends JpaRepository<User, Integer>{
    User findByCodeAndPassword(String code, String password);;

    Optional<Object> findAllById(Long id);


}
