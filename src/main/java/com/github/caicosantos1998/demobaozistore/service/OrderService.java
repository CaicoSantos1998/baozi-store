package com.github.caicosantos1998.demobaozistore.service;

import com.github.caicosantos1998.demobaozistore.entities.Order;
import com.github.caicosantos1998.demobaozistore.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public void save(Order order) {
        orderRepository.save(order);
    }

    public void update(Long id, Order order) {
        Order OrderUpdated = orderRepository.findById(id)
                        .orElseThrow(() -> new RuntimeException("Order not found!"));
        OrderUpdated.setCustomer(order.getCustomer());
        OrderUpdated.setProduct(order.getProduct());
        OrderUpdated.setQuantity(order.getQuantity());
        orderRepository.save(OrderUpdated);
    }

    public void delete(Long id) {
        orderRepository.deleteById(id);
    }

    public Optional<Order> findById(Long id) {
        return orderRepository.findById(id);
    }

    public List<Order> findAll() {
        return orderRepository.findAll();
    }
}
