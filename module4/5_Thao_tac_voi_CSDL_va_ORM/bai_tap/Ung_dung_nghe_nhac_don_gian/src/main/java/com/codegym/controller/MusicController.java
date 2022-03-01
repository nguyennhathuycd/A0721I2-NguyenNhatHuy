package com.codegym.controller;

import com.codegym.model.Music;
import com.codegym.service.IMusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class MusicController {
    @Autowired
    private IMusicService musicService;

    @GetMapping("/create-music")
    public ModelAndView showCreateForm() {
        ModelAndView modelAndView = new ModelAndView("/music/create");
        modelAndView.addObject("music", new Music());
        return modelAndView;
    }

    @PostMapping("/create-music")
    public ModelAndView saveMusic(@ModelAttribute("music") Music music) {
        musicService.save(music);
        ModelAndView modelAndView = new ModelAndView("/music/create");
        modelAndView.addObject("customer", new Music());
        modelAndView.addObject("message", "New music created successfully!");
        return modelAndView;
    }

    @GetMapping("/music")
    public ModelAndView listMusic() {
        List<Music> musics = musicService.findAll();
        ModelAndView modelAndView = new ModelAndView("/music/list");
        modelAndView.addObject("musics", musics);
        return modelAndView;
    }

    @GetMapping("/view-music/{id}")
    public ModelAndView viewMusic(@PathVariable Long id) {
        Music music = musicService.findOne(id);
        ModelAndView modelAndView = new ModelAndView("/music/view");
        modelAndView.addObject("music", music);
        return modelAndView;
    }

    @GetMapping("/edit-music/{id}")
    public ModelAndView showEditForm(@PathVariable Long id) {
        Music music = musicService.findOne(id);
        if (music != null) {
            ModelAndView modelAndView = new ModelAndView("/music/edit");
            modelAndView.addObject("music", music);
            return modelAndView;

        } else {
            ModelAndView modelAndView = new ModelAndView("music//error.404");
            return modelAndView;
        }
    }

    @PostMapping("/edit-music")
    public ModelAndView updateMusic(@ModelAttribute("music") Music music) {
        musicService.save(music);
        ModelAndView modelAndView = new ModelAndView("/music/edit");
        modelAndView.addObject("music", music);
        modelAndView.addObject("message", "Music updated successfully");
        return modelAndView;
    }

    @GetMapping("/delete-music/{id}")
    public ModelAndView showDeleteForm(@PathVariable Long id) {
        Music music = musicService.findOne(id);
        if (music != null) {
            ModelAndView modelAndView = new ModelAndView("/music/delete");
            modelAndView.addObject("music", music);
            return modelAndView;

        } else {
            ModelAndView modelAndView = new ModelAndView("music/error.404");
            return modelAndView;
        }
    }

    @PostMapping("/delete-music")
    public String deleteMusic(@ModelAttribute("music") Music music) {
        musicService.remove(music.getId());
        return "redirect:music";
    }
}
