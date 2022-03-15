package com.codegym.restful_cho_ung_dung_blog.service;

import java.util.List;
import java.util.Optional;

public interface IGeneralService<T> {
    public List<T> findAll();
    public Optional<T> findById(Long id);
}
