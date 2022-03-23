package com.codegym.hoan_thien_ung_dung_quan_ly_dien_thoai.service;

import com.codegym.hoan_thien_ung_dung_quan_ly_dien_thoai.model.Smartphone;

import java.util.Optional;

public interface ISmartphoneService {
    Iterable<Smartphone> findAll();

    Optional<Smartphone> findById(Long id);

    Smartphone save(Smartphone smartPhone);

    void remove(Long id);
}
