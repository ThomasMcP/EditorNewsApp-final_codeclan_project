package com.codeclan.newsApp.newsApp.repositories.ArticleRepository;

import com.codeclan.newsApp.newsApp.models.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long>, ArticleRepositoryCustom {
}
