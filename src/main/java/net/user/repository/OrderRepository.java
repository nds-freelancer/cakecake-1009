package net.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.user.entity.OrderCa;
import net.user.entity.OrderCake;

public interface OrderRepository extends JpaRepository<OrderCa, Integer> {
	
	
}
