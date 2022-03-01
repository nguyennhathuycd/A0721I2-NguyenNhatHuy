package com.codegym.service;

import com.codegym.model.Email;

import java.util.List;

public interface IEmailService {
    public List<Email> showAll();
    public Email findById(Integer id);
    public void update(Email email);
}
