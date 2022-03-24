package com.codegym.i18n_cho_quan_ly_khach_hang.service;


import java.util.Optional;

public interface IGeneralService<T> {
    Iterable<T> findAll();

    Optional findById(Long id);

    void save(T t);

    void remove(Long id);
}