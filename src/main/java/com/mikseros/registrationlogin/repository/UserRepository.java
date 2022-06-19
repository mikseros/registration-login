package com.mikseros.registrationlogin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mikseros.registrationlogin.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
