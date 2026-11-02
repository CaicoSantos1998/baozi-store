package com.github.caicosantos1998.demobaozistore.repository;

import com.github.caicosantos1998.demobaozistore.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product, Long> {
}
