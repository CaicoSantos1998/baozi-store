package com.github.caicosantos1998.demobaozistore.service;

import com.github.caicosantos1998.demobaozistore.entities.Product;
import com.github.caicosantos1998.demobaozistore.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public void save(Product product) {
        productRepository.save(product);
    }

    public void update(Long id, Product product) {
        Product productUpdated = productRepository.findById(id)
                        .orElseThrow(() -> new RuntimeException("Product not found!"));
        productUpdated.setName(product.getName());
        productUpdated.setStorage(product.getStorage());
        productUpdated.setPrice(product.getPrice());
        productRepository.save(productUpdated);
    }

    public void delete(Long id) {
        productRepository.deleteById(id);
    }

    public Optional<Product> findById(Long id) {
        return productRepository.findById(id);
    }

    public List<Product> findAll() {
        return productRepository.findAll();
    }
}
