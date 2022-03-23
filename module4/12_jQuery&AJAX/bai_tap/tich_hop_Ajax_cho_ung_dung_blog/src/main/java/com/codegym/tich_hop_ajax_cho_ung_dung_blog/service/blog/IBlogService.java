package com.codegym.tich_hop_ajax_cho_ung_dung_blog.service.blog;

import com.codegym.tich_hop_ajax_cho_ung_dung_blog.model.Blog;
import com.codegym.tich_hop_ajax_cho_ung_dung_blog.model.Category;
import com.codegym.tich_hop_ajax_cho_ung_dung_blog.service.IGeneralService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IBlogService extends IGeneralService<Blog> {
    Iterable<Blog> findAllByCategory(Category category);
    Page<Blog> findAll(Pageable pageable);
    Page<Blog> findAllByOrderByDateSubmittedDesc(Pageable pageable);
    Page<Blog> findAllByTitleContainingOrderByDateSubmittedDesc(String title, Pageable pageable);
}
