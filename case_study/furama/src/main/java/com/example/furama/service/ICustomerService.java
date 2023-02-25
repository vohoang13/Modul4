package com.example.furama.service;

import com.example.furama.model.Customer;

import java.util.List;

public interface ICustomerService {
    void save(Customer customer);

    List<Customer> findAll();

    void deleteById(Integer id);
}
