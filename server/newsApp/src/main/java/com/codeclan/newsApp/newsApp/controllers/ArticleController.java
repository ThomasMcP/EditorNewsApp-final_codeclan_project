package com.codeclan.newsApp.newsApp.controllers;

import com.codeclan.newsApp.newsApp.models.Article;
import com.codeclan.newsApp.newsApp.repositories.ArticleRepository.ArticleRepository;
import com.codeclan.newsApp.newsApp.repositories.JournalistRepository.JournalistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

public class ArticleController {

    @RestController
    @RequestMapping(value = "/articles")
    public class JournalistController {

        @Autowired
        ArticleRepository articleRepository;

        @Autowired
        JournalistRepository journalistRepository;

        @GetMapping(value =  "/title/{title}")
        public List<Article> getArticlesByTitle(@PathVariable String title){
            return articleRepository.getArticlesByTitle(title);
        }

//        @GetMapping(value = "/date/{date}")
//        public List<Article> getArticlesByDate(@PathVariable String date){
//            return articleRepository.getArticlesByDate(date);
//        }

        @GetMapping(value = "/name/{name}")
        public List <Article> getAllJournalistByName(@PathVariable String name ){
            return articleRepository.getAllJournalistByName(name);
        }

    }
}