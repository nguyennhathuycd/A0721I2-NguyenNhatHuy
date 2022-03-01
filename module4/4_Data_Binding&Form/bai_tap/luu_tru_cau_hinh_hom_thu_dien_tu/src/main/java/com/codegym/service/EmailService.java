package com.codegym.service;

import com.codegym.model.Email;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmailService implements IEmailService {
    private static Map<Integer, Email> emailList;

    static {
        emailList = new HashMap<>();
        emailList.put(1, new Email(1, "English", 25, true, "Thor, King Asgard"));
        emailList.put(2, new Email(2, "Vietnamses", 15, false, "Huy, Vua Quang Binh"));
        emailList.put(3, new Email(3, "Vietnamses", 1, true, "Linh, Vua Codegym"));
    }

    public List<Email> showAll() {
        return new ArrayList<>(emailList.values());
    }

    public Email findById(Integer id) {
        return emailList.get(id);
    }

    public void update(Email email) {
        emailList.put(email.getId(), email);
    }
}
