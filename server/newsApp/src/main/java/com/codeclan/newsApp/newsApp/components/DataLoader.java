package com.codeclan.newsApp.newsApp.components;


import com.codeclan.newsApp.newsApp.models.Article;
import com.codeclan.newsApp.newsApp.repositories.ArticleRepository.ArticleRepository;
import com.codeclan.newsApp.newsApp.repositories.JournalistRepository.JournalistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {


    @Autowired
    ArticleRepository articleRepository;

    @Autowired
    JournalistRepository journalistRepository;

    public DataLoader(){

    }

    public void run(ApplicationArguments args){

//        Article article1 = new Article("The robot tendrils that mimic plants, and other tech news","story 1","technology",
//                "https//bbc.co.uk/rssfeed", "https://aws-static.image_not_real.co.uk");
//        articleRepository.save(article1);
//
//        Article article2 = new Article("Saving my daughter from Instagram self-harm","another story 2","technology",
//                "https//bbc.co.uk/rssfeed", "https://aws-static.image_not_real.co.uk");
//        articleRepository.save(article2);


    }
}