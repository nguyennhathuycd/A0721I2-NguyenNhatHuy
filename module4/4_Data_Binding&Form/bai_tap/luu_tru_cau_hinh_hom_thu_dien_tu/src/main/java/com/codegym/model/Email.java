package com.codegym.model;

public class Email {
    private int id;
    private String language;
    private int page_size;
    private boolean spam_filter;
    private String Signature;

    public Email() {
    }

    public Email(int id, String language, int page_size, boolean spam_filter, String signature) {
        this.id = id;
        this.language = language;
        this.page_size = page_size;
        this.spam_filter = spam_filter;
        Signature = signature;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getPage_size() {
        return page_size;
    }

    public void setPage_size(int page_size) {
        this.page_size = page_size;
    }

    public boolean isSpam_filter() {
        return spam_filter;
    }

    public void setSpam_filter(boolean spam_filter) {
        this.spam_filter = spam_filter;
    }

    public String getSignature() {
        return Signature;
    }

    public void setSignature(String signature) {
        Signature = signature;
    }
}
