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
import java.util.GregorianCalendar;

@Component
public class DataLoader implements ApplicationRunner {


    @Autowired
    ArticleRepository articleRepository;

    @Autowired
    JournalistRepository journalistRepository;

    public DataLoader() {

    }

    //    title; journalist; content;date; url;image_url;
    public void run(ApplicationArguments args) {

        Journalist steven = new Journalist("Steven");
        journalistRepository.save(steven);

        Journalist chris = new Journalist("Chris");
        journalistRepository.save(chris);

        Journalist tom = new Journalist("Tom");
        journalistRepository.save(tom);

        Journalist david = new Journalist("David");
        journalistRepository.save(david);

        GregorianCalendar date1 = new GregorianCalendar(2018, 10, 5);
        GregorianCalendar date2 = new GregorianCalendar(1999, 12, 12);
        GregorianCalendar date3 = new GregorianCalendar(2005, 8, 13);
        GregorianCalendar date4 = new GregorianCalendar(2019, 02, 3);


        Article article1 = new Article("Tendril Nostrils", "The investigation into the Bog Monster", "http:bbc.co.uk/feed/", "http:src.image_placeholder", date1, "description here", david);
        articleRepository.save(article1);

        Article article2 = new Article("Tech News", "Tech content", "www.tech.com", "image.tech.org", date2, "tech description", chris);
        articleRepository.save(article2);

        Article article3 = new Article("Sports News", "Sports Content", "www.sports.com", "image.sports.org", date3, "sports description", steven);
        articleRepository.save(article3);

        Article article4 = new Article("Science News", "Science Content", "www.science.com", "image.science.org", date4, "science description", tom);
        articleRepository.save(article4);

        Article article5 = new Article("Business News", "Business Content", "www.Business.com", "image.Business.org", date3, "Business description", steven);
        articleRepository.save(article5);




    }
}