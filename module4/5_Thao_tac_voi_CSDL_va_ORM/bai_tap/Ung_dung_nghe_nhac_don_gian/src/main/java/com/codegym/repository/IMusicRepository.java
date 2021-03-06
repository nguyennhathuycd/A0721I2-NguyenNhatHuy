package com.codegym.repository;

import com.codegym.model.Music;

import java.util.List;

public interface IMusicRepository {
    List<Music> findAll();
    Music findOne(Long id);
    void save(Music music);
    void remove(Long id);
}
