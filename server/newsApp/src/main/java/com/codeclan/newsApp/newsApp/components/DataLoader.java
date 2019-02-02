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

    public DataLoader() {

    }


    public void run(ApplicationArguments args) {

        Journalist journalist1 = new Journalist("Peter Parker");
        journalistRepository.save(journalist1);

        Journalist journalist2 = new Journalist("Clark Kent");
        journalistRepository.save(journalist2);

        Journalist journalist3 = new Journalist("Stevie Legend");
        journalistRepository.save(journalist3);


        Date date1 = new Date(1988, 8, 22);
        Date date2 = new Date(2019, 2, 2);
        Date date3 = new Date(2018, 12, 25);

        Article article1 = new Article("Tech Talks", journalist1, "Description about it", "www.tech.com", date1, "Tech stuff", "image.link");
        articleRepository.save(article1);

        Article article2 = new Article("Business Talks", journalist2, "Description about it", "www.business.com", date2, "Business stuff", "image.link");
        articleRepository.save(article2);

        Article article3 = new Article("Sports Talks", journalist3, "Description about it", "www.sports.com", date3, "Sports stuff", "image.link");
        articleRepository.save(article3);

        Article article4 = new Article("Health Talks", journalist1, "Description about it", "www.health.com", date2, "Health stuff", "image.link");
        articleRepository.save(article4);

    }

}
