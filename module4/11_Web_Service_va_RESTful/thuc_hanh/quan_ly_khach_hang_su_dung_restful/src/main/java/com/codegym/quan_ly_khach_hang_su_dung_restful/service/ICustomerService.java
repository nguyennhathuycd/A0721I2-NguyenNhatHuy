package com.codegym.quan_ly_khach_hang_su_dung_restful.service;

import com.codegym.quan_ly_khach_hang_su_dung_restful.model.Customer;

import java.util.Optional;

public interface ICustomerService {
    Iterable<Customer> findAll();

    Optional<Customer> findById(Long id);

    Customer save(Customer customer);

    void remove(Long id);
}
