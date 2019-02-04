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
@RequestMapping(value = "/journalists")
public class JournalistController {

    @Autowired
    JournalistRepository journalistRepository;

    @Autowired
    ArticleRepository articleRepository;

    @GetMapping(value = "/{id}")
    public List<Journalist> getJournalistsWithName(@PathVariable Long id){
        return journalistRepository.findJournalistById(id);
    }

<<<<<<< HEAD
}
=======
}
>>>>>>> fa75ad8af2b90b0827a17f80e850007bad49f997
