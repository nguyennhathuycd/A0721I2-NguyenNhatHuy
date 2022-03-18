package com.example.hoan_thien_bai_gio_hang.service;

import com.example.hoan_thien_bai_gio_hang.model.Product;

import java.util.Optional;

public interface IProductService {
    Iterable<Product> findAll();
    Optional<Product> findById(Long id);
}
