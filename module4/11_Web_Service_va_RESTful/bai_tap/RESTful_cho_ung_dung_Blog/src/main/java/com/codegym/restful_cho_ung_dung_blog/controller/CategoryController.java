package com.codegym.restful_cho_ung_dung_blog.controller;

import com.codegym.restful_cho_ung_dung_blog.model.Blog;
import com.codegym.restful_cho_ung_dung_blog.model.Category;
import com.codegym.restful_cho_ung_dung_blog.service.blog.BlogService;
import com.codegym.restful_cho_ung_dung_blog.service.blog.IBlogService;
import com.codegym.restful_cho_ung_dung_blog.service.category.CategoryService;
import com.codegym.restful_cho_ung_dung_blog.service.category.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/categories")
public class CategoryController {
    @Autowired
    private ICategoryService iCategoryService = new CategoryService();

    @Autowired
    private IBlogService iBlogService = new BlogService();

    @GetMapping("")
    public ResponseEntity<Iterable<Category>> findAll() {
        List<Category> categoryList = (List<Category>) iCategoryService.findAll();
        if (categoryList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(categoryList, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Iterable<Blog>> findById(@PathVariable Long id) {
        Optional<Category> categoryOptional = iCategoryService.findById(id);
        List<Blog> blogList = iBlogService.findAllByCategory(categoryOptional.get());
        if (blogList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(blogList, HttpStatus.OK);
    }
}
