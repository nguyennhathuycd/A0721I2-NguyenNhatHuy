package com.codegym.validate_form_dang_ky.repository;

import com.codegym.validate_form_dang_ky.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends JpaRepository<User, Long> {
}
