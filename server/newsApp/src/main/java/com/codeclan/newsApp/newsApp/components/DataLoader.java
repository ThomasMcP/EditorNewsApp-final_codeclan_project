package com.codeclan.newsApp.newsApp.components;


import com.codeclan.newsApp.newsApp.models.Article;
import com.codeclan.newsApp.newsApp.models.Journalist;
import com.codeclan.newsApp.newsApp.repositories.ArticleRepository.ArticleRepository;
import com.codeclan.newsApp.newsApp.repositories.JournalistRepository.JournalistRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.io.*;
import java.nio.file.Paths;

import java.util.ArrayList;
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
    public void run(ApplicationArguments args) throws IOException {

        // find file in same directory as this file
        String currPath = Paths.get(".").toAbsolutePath().normalize().toString();
        currPath += "/src/main/java/com/codeclan/newsApp/newsApp/components/mockdata.json";
        System.out.println(currPath);

        // read file into string

        File file = new File(currPath);
        FileInputStream fis = new FileInputStream(file);
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        ArrayList<String> lines = new ArrayList<String>();
        String line;
        while((line = br.readLine()) != null){
            //process the line
            lines.add(line);
        }
        br.close();
        System.out.println(lines.get(0));

        // parse
        String jsonString = lines.get(0);
        ObjectMapper objectMapper = new ObjectMapper();
        Article[] article = objectMapper.readValue(jsonString, Article[].class);
        System.out.println(article);

//        Journalist steven = new Journalist("Steven");
//        journalistRepository.save(steven);
//
//        Journalist chris = new Journalist("Chris");
//        journalistRepository.save(chris);
//
//        Journalist tom = new Journalist("Tom");
//        journalistRepository.save(tom);
//
//        Journalist david = new Journalist("David");
//        journalistRepository.save(david);
//
//        GregorianCalendar date1 = new GregorianCalendar(2018, 10, 5);
//        GregorianCalendar date2 = new GregorianCalendar(1999, 12, 12);
//        GregorianCalendar date3 = new GregorianCalendar(2005, 8, 13);
//        GregorianCalendar date4 = new GregorianCalendar(2019, 02, 3);
//
//
//        Article article1 = new Article("Tendril Nostrils", "The investigation into the Bog Monster", "http:bbc.co.uk/feed/", "http:src.image_placeholder", date1, "description here", david);
//        articleRepository.save(article1);
//
//        Article article2 = new Article("Tech News", "Tech content", "www.tech.com", "image.tech.org", date2, "tech description", chris);
//        articleRepository.save(article2);
//
//        Article article3 = new Article("Sports News", "Sports Content", "www.sports.com", "image.sports.org", date3, "sports description", steven);
//        articleRepository.save(article3);
//
//        Article article4 = new Article("Science News", "Science Content", "www.science.com", "image.science.org", date4, "science description", tom);
//        articleRepository.save(article4);
//
//        Article article5 = new Article("Business News", "Business Content", "www.Business.com", "image.Business.org", date3, "Business description", steven);
//        articleRepository.save(article5);
//



    }
}