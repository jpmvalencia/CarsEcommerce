package com.springboot.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.app.model.Order;
import com.springboot.app.model.User;

public interface OrderRepository extends JpaRepository<Order, Long>{
    List<Order> findByUser(User user);
}
