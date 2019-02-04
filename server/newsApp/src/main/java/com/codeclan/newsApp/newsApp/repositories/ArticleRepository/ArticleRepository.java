package com.codeclan.newsApp.newsApp.repositories.ArticleRepository;

import com.codeclan.newsApp.newsApp.models.Article;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

public interface ArticleRepository extends JpaRepository<Article, Long>,
        ArticleRepositoryCustom {
    // Spring Data JPA Method ("Derived") Query
    List<Article> getArticlesByTitle(String title);

    //    return list of articles sorted by date
//   List<Article> getArticlesByDate(Date date);

    List<Article> findArticleById(Long articleId);

    //will return articles by said journalist based on id
    List<Article> findArticleByJournalistId(Long journalist_id);
}


