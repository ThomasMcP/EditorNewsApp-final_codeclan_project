package com.codeclan.newsApp.newsApp.controllers;

import com.codeclan.newsApp.newsApp.models.Journalist;
import com.codeclan.newsApp.newsApp.repositories.ArticleRepository.ArticleRepository;
import com.codeclan.newsApp.newsApp.repositories.JournalistRepository.JournalistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/journalists")
public class JournalistController {

    @Autowired
    JournalistRepository journalistRepository;

    @Autowired
    ArticleRepository articleRepository;

    @GetMapping(value = "/id/{id}")
    public List<Journalist> getJournalistsById(@PathVariable Long id) {
        return journalistRepository.findJournalistById(id);
    }

    @GetMapping
    public List<Journalist> getAllJournalists(){
        return journalistRepository.findAll();
    }
}