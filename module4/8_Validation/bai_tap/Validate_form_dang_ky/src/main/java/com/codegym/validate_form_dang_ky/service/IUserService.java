package com.codegym.validate_form_dang_ky.service;

import com.codegym.validate_form_dang_ky.model.User;

import java.util.Optional;

public interface IUserService{
    public void createUser(User user);
    public Optional<User> findById(Long id);
}
