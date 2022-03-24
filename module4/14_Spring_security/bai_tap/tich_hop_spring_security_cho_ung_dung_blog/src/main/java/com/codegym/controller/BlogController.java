package com.codegym.controller;

import com.codegym.model.Blog;
import com.codegym.model.Category;
import com.codegym.service.blog.IBlogService;
import com.codegym.service.category.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
public class BlogController {
    @Autowired
    private IBlogService blogService;

    @Autowired
    private ICategoryService iCategoryService;

    @ModelAttribute("categories")
    public Iterable<Category> categories() {
        return iCategoryService.findAll();
    }

    @GetMapping("/blogs")
    public ModelAndView listBlogs(@RequestParam("search") Optional<String> search, @PageableDefault(size = 5) Pageable pageable) {
        Page<Blog> blogs;
        if (search.isPresent()) {
            blogs = blogService.findAllByTitleContainingOrderByDateSubmittedDesc(search.get(), pageable);
        } else {
            blogs = blogService.findAllByOrderByDateSubmittedDesc(pageable);
        }
        ModelAndView modelAndView = new ModelAndView("/blog/list");
        modelAndView.addObject("blogs", blogs);
        return modelAndView;
    }

    @GetMapping("/create-blog")
    public ModelAndView showCreateForm() {
        ModelAndView modelAndView = new ModelAndView("/blog/create");
        modelAndView.addObject("blog", new Blog());
        return modelAndView;
    }

    @PostMapping("/create-blog")
    public ModelAndView saveBlog(@ModelAttribute("blog") Blog blog) {
        blogService.save(blog);
        ModelAndView modelAndView = new ModelAndView("/blog/create");
        modelAndView.addObject("blog", new Blog());
        modelAndView.addObject("message", "New blog created successfully");
        return modelAndView;
    }

    @GetMapping("/view-blog/{id}")
    public ModelAndView showView(@PathVariable long id) {
        ModelAndView modelAndView = new ModelAndView("/blog/view");
        Optional<Blog> blog = blogService.findById(id);
        modelAndView.addObject("blog", blog.get());
        return modelAndView;
    }

    @GetMapping("/edit-blog/{id}")
    public ModelAndView showEditForm(@PathVariable long id) {
        ModelAndView modelAndView = new ModelAndView("/blog/edit");
        Optional<Blog> blog = blogService.findById(id);
        modelAndView.addObject("blog", blog.get());
        return modelAndView;
    }

    @PostMapping("/edit-blog")
    public ModelAndView edit(@ModelAttribute("blog") Blog blog) {
        blogService.save(blog);
        ModelAndView modelAndView = new ModelAndView("/blog/edit");
        modelAndView.addObject("blog", blog);
        modelAndView.addObject("msg", "Update successfully.");
        return modelAndView;
    }

    @GetMapping("/delete-blog/{id}")
    public ModelAndView showDeleteForm(@PathVariable long id) {
        ModelAndView modelAndView = new ModelAndView("/blog/delete");
        Optional<Blog> blog = blogService.findById(id);
        modelAndView.addObject("blog", blog.get());
        return modelAndView;
    }

    @PostMapping("/delete-blog")
    public ModelAndView delete(@ModelAttribute Blog blog) {
        ModelAndView modelAndView = new ModelAndView("/blog/list");
        blogService.remove(blog.getId());
        modelAndView.addObject("blogs", blogService.findAll());
        modelAndView.addObject("msg", "Delete blog successfully.");
        return modelAndView;
    }
}
