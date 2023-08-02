package com.nextwave.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nextwave.course.entities.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem,Long>{
	
}
