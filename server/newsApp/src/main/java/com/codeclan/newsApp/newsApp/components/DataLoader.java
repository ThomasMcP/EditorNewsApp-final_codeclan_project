package com.codeclan.newsApp.newsApp.components;


import com.codeclan.newsApp.newsApp.models.Article;
import com.codeclan.newsApp.newsApp.models.Journalist;
import com.codeclan.newsApp.newsApp.repositories.ArticleRepository.ArticleRepository;
import com.codeclan.newsApp.newsApp.repositories.JournalistRepository.JournalistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class DataLoader implements ApplicationRunner {


    @Autowired
    ArticleRepository articleRepository;

    @Autowired
    JournalistRepository journalistRepository;

    public DataLoader(){

    }
    //    title; journalist; content;date; url;image_url;
    public void run(ApplicationArguments args){
        Journalist david = new Journalist("Steven");
        journalistRepository.save(david);

        Article article1 = new Article("Tendril Nostrils",
                "The investigation into the Bog Monster",
                "http:bbc.co.uk/feed/", "http:src.image_placeholder", new Date(),"description here", david );
        articleRepository.save(article1);


    }
}