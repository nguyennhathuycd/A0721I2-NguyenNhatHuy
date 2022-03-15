package com.codegym.validate_form_dang_ky.service;

import com.codegym.validate_form_dang_ky.model.User;
import com.codegym.validate_form_dang_ky.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService implements IUserService{
    @Autowired
    private IUserRepository iUserRepository;

    @Override
    public void createUser(User user) {
        iUserRepository.save(user);
    }

    @Override
    public Optional<User> findById(Long id) {
        return iUserRepository.findById(id);
    }
}
