package com.dipak.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dipak.blog.entities.User;

public interface UserRepo extends JpaRepository<User, Integer>{

	
	
}
