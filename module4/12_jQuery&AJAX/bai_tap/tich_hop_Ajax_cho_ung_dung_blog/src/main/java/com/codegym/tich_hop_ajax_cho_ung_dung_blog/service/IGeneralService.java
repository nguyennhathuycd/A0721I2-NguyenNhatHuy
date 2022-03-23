package com.codegym.tich_hop_ajax_cho_ung_dung_blog.service;

import java.util.List;
import java.util.Optional;

public interface IGeneralService<T> {
    public List<T> findAll();
    public Optional<T> findById(Long id);
    public void save(T t);
    public void remove(Long id);
}
