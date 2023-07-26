package com.nextwave.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nextwave.course.entities.User;


public interface UserRepository extends JpaRepository<User,Long>{
	
}
