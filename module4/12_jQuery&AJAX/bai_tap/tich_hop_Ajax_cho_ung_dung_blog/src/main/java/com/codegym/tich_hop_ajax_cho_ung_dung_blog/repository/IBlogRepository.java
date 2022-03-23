package com.codegym.tich_hop_ajax_cho_ung_dung_blog.repository;

import com.codegym.tich_hop_ajax_cho_ung_dung_blog.model.Blog;
import com.codegym.tich_hop_ajax_cho_ung_dung_blog.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBlogRepository extends JpaRepository<Blog, Long> {
    Iterable<Blog> findAllByCategory(Category category);
    Page<Blog> findAllByTitleContainingOrderByDateSubmittedDesc(String title, Pageable pageable);
    Page<Blog> findAllByOrderByDateSubmittedDesc(Pageable pageable);
}
