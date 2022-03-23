package com.codegym.tich_hop_ajax_cho_ung_dung_blog.service.blog;

import com.codegym.tich_hop_ajax_cho_ung_dung_blog.model.Blog;
import com.codegym.tich_hop_ajax_cho_ung_dung_blog.model.Category;
import com.codegym.tich_hop_ajax_cho_ung_dung_blog.repository.IBlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BlogService implements IBlogService {
    @Autowired
    private IBlogRepository blogRepository;


    @Override
    public List<Blog> findAll() {
        return blogRepository.findAll();
    }

    @Override
    public Optional<Blog> findById(Long id) {
        return blogRepository.findById(id);
    }

    @Override
    public void save(Blog blog) {
        blogRepository.save(blog);
    }

    @Override
    public void remove(Long id) {
        blogRepository.deleteById(id);
    }

    @Override
    public Iterable<Blog> findAllByCategory(Category category) {
        return blogRepository.findAllByCategory(category);
    }

    @Override
    public Page<Blog> findAll(Pageable pageable) {
        return blogRepository.findAll(pageable);
    }

    @Override
    public Page<Blog> findAllByOrderByDateSubmittedDesc(Pageable pageable) {
        return blogRepository.findAllByOrderByDateSubmittedDesc(pageable);
    }


    @Override
    public Page<Blog> findAllByTitleContainingOrderByDateSubmittedDesc(String title, Pageable pageable) {
        return blogRepository.findAllByTitleContainingOrderByDateSubmittedDesc(title, pageable);
    }
}
