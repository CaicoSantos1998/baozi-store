package com.github.caicosantos1998.demobaozistore.service;

import com.github.caicosantos1998.demobaozistore.entities.Customer;
import com.github.caicosantos1998.demobaozistore.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public void save(Customer customer) {
        customerRepository.save(customer);
    }

    public void update(Long id, Customer customer) {
        Customer customerUpdated = customerRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Customer not found"));
        customerUpdated.setName(customer.getName());
        customerUpdated.setRegisDate(customer.getRegisDate());
        customerRepository.save(customerUpdated);
    }

    public void delete(Long id) {
        customerRepository.deleteById(id);
    }

    public Optional<Customer> findById(Long id) {
        return customerRepository.findById(id);
    }

    public List<Customer> findAll() {
        return customerRepository.findAll();
    }
}
