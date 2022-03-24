package com.codegym.i18n_cho_quan_ly_khach_hang.service.customer;

import com.codegym.i18n_cho_quan_ly_khach_hang.model.Customer;
import com.codegym.i18n_cho_quan_ly_khach_hang.model.Province;
import com.codegym.i18n_cho_quan_ly_khach_hang.service.IGeneralService;

public interface ICustomerService extends IGeneralService<Customer> {
    Iterable<Customer> findAllByProvince(Province province);
}
