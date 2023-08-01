package com.nextwave.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nextwave.course.entities.Category;


public interface CategoryRepository extends JpaRepository<Category,Long>{
	
}
