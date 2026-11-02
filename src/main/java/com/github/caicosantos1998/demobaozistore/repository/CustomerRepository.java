package com.github.caicosantos1998.demobaozistore.repository;

import com.github.caicosantos1998.demobaozistore.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
