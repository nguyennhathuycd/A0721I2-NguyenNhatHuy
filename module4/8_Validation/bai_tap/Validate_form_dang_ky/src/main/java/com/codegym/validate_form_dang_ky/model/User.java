package com.codegym.validate_form_dang_ky.model;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import javax.persistence.*;

@Entity
@Table(name = "users")
@Component
public class User implements Validator {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstname;
    private String lastname;
    private String phoneNumber;
    private int age;
    private String email;

    public User() {
    }

    public User(String firstname, String lastname, String phoneNumber, int age, String email) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return User.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        User user = (User) target;
        ValidationUtils.rejectIfEmpty(errors, "firstname", "name.empty");
        ValidationUtils.rejectIfEmpty(errors, "lastname", "name.empty");
        if (user.firstname.length() < 5 || user.firstname.length() > 45) {
            errors.rejectValue("firstname", "name.length");
        }
        if (user.lastname.length() < 5 || user.lastname.length() > 45) {
            errors.rejectValue("lastname", "name.length");
        }
        if (user.phoneNumber.length() < 10 || user.phoneNumber.length() > 11) {
            errors.rejectValue("phoneNumber", "number.length");
        }
        if (!user.phoneNumber.startsWith("0")) {
            errors.rejectValue("phoneNumber", "number.startsWith");
        }
        if (!user.phoneNumber.matches("(^$|[0-9]*$)")) {
            errors.rejectValue("phoneNumber", "number.matches");
        }
        if (user.age < 18) {
            errors.rejectValue("age", "age.min");
        }
        if (!user.email.matches("(^$|[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$)")) {
            errors.rejectValue("email", "email.matches");
        }
    }
}
