package com.example.hoan_thien_bai_gio_hang.repository;

import com.example.hoan_thien_bai_gio_hang.model.Product;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductRepository extends PagingAndSortingRepository<Product, Long> {
}
