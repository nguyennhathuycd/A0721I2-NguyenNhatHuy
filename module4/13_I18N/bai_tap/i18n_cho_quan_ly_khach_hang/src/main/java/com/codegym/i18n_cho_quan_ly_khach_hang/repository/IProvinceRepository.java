package com.codegym.i18n_cho_quan_ly_khach_hang.repository;

import com.codegym.i18n_cho_quan_ly_khach_hang.model.Province;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProvinceRepository extends PagingAndSortingRepository<Province, Long> {
}
