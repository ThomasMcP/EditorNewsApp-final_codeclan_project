package com.codeclan.newsApp.newsApp.repositories.ArticleRepository;

import com.codeclan.newsApp.newsApp.models.Article;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ArticleRepository extends JpaRepository<Article, Long>,
        ArticleRepositoryCustom {
    // Spring Data JPA Method ("Derived") Query
    List<Article> getArticlesByTitle(String title);

    //return list of articles by specific category e.g. tech...
    List<Article> getArticlesByCategory(String category);

    //return list of articles sorted by date
//    List<Article> getArticlesByDate(String date);//refactor later to DATE

    //will return articles by said journalist based on id
    List<Article> getAllJournalistByName(String name);
}


