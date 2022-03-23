package com.codegym.tich_hop_ajax_cho_ung_dung_blog.repository;

import com.codegym.tich_hop_ajax_cho_ung_dung_blog.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICategoryRepository extends JpaRepository<Category, Long> {
}
