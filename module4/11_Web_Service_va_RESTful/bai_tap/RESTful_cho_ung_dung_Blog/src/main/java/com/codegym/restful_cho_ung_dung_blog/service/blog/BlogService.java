package com.codegym.restful_cho_ung_dung_blog.service.blog;

import com.codegym.restful_cho_ung_dung_blog.model.Blog;
import com.codegym.restful_cho_ung_dung_blog.model.Category;
import com.codegym.restful_cho_ung_dung_blog.repository.IBlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BlogService implements IBlogService{
    @Autowired
    private IBlogRepository iBlogRepository;

    @Override
    public List<Blog> findAll() {
        return iBlogRepository.findAll();
    }

    @Override
    public Optional<Blog> findById(Long id) {
        return iBlogRepository.findById(id);
    }

    @Override
    public List<Blog> findAllByCategory(Category category) {
        return iBlogRepository.findAllByCategory(category);
    }
}
