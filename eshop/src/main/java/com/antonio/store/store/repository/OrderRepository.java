package com.antonio.store.store.repository;

import java.util.List;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.repository.CrudRepository;

import com.antonio.store.store.entity.Order;
import com.antonio.store.store.entity.User;

public interface OrderRepository extends CrudRepository<Order, Long> {

	List<Order> findByUser(User user);

	@EntityGraph(attributePaths = { "cartItems", "payment", "shipping" })
	Order findEagerById(Long id);

}
