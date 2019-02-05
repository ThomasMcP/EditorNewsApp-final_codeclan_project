package com.codeclan.newsApp.newsApp.controllers;

import com.codeclan.newsApp.newsApp.models.Article;
import com.codeclan.newsApp.newsApp.repositories.ArticleRepository.ArticleRepository;
import com.codeclan.newsApp.newsApp.repositories.JournalistRepository.JournalistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/api/articles")
public class ArticleController {

    @Autowired
    ArticleRepository articleRepository;

    @Autowired
    JournalistRepository journalistRepository;

    @GetMapping(value =  "/title/{title}")
    public List<Article> getArticlesByTitle(@PathVariable String title){
        return articleRepository.getArticlesByTitle(title);
    }

    @GetMapping(value = "/journalist/id/{journalist_id}")
    public List<Article> findArticleByJournalistId(@PathVariable Long journalist_id){
        return  articleRepository.findArticleByJournalistId(journalist_id);
    }

    @GetMapping(value = "/id/{id}")
    public List<Article> findArticleById(@PathVariable Long id){
        return articleRepository.findArticleById(id);
    }

    @CrossOrigin(origins="http://localhost:3000")
    @GetMapping
    public List<Article> findAllArticles(){
        return articleRepository.findAll();
    }
//        @GetMapping(value = "/date/{date}")
//        public List<Article> getArticlesByDate(@PathVariable String date){
//            return articleRepository.getArticlesByDate(date);
//        }

}