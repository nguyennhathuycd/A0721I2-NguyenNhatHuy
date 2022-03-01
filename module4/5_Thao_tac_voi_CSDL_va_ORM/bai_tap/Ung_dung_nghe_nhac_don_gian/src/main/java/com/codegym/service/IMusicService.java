package com.codegym.service;

import com.codegym.model.Music;

import java.util.List;

public interface IMusicService {
    List<Music> findAll();
    Music findOne(Long id);
    void save(Music music);
    void remove(Long id);
}
