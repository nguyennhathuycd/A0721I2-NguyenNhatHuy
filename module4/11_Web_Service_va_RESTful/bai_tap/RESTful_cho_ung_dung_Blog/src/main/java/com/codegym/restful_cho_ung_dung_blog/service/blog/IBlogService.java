package com.codegym.restful_cho_ung_dung_blog.service.blog;

import com.codegym.restful_cho_ung_dung_blog.model.Blog;
import com.codegym.restful_cho_ung_dung_blog.model.Category;
import com.codegym.restful_cho_ung_dung_blog.service.IGeneralService;

import java.util.List;

public interface IBlogService extends IGeneralService<Blog> {
    List<Blog> findAllByCategory(Category category);
}
