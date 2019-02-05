package com.codeclan.newsApp.newsApp.repositories.JournalistRepository;

import com.codeclan.newsApp.newsApp.models.Journalist;
import com.codeclan.newsApp.newsApp.projections.EmbedArticle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(excerptProjection = EmbedArticle.class)
public interface JournalistRepository extends JpaRepository<Journalist, Long>, JournalistRepositoryCustom {

    List<Journalist> findJournalistById(Long journalistId);
}

