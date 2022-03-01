package com.codegym.service;

import com.codegym.model.Music;
import com.codegym.repository.IMusicRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MusicService implements IMusicService{
    @Autowired
    private IMusicRepository musicRepository;

    @Override
    public List<Music> findAll() {
        return musicRepository.findAll();
    }

    @Override
    public Music findOne(Long id) {
        return musicRepository.findOne(id);
    }

    @Override
    public void save(Music music) {
        musicRepository.save(music);
    }

    @Override
    public void remove(Long id) {
        musicRepository.remove(id);
    }
}
