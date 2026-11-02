package com.github.caicosantos1998.demobaozistore.repository;

import com.github.caicosantos1998.demobaozistore.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
