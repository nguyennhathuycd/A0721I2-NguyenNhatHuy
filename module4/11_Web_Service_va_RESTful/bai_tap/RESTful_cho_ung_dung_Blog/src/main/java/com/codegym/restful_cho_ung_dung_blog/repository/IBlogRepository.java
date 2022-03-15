package com.codegym.restful_cho_ung_dung_blog.repository;

import com.codegym.restful_cho_ung_dung_blog.model.Blog;
import com.codegym.restful_cho_ung_dung_blog.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IBlogRepository extends JpaRepository<Blog, Long> {
    List<Blog> findAllByCategory(Category category);
}
