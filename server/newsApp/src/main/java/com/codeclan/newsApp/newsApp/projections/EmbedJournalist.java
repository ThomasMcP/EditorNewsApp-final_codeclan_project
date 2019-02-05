package com.codeclan.newsApp.newsApp.projections;

import com.codeclan.newsApp.newsApp.models.Article;
import com.codeclan.newsApp.newsApp.models.Journalist;
import org.springframework.data.rest.core.config.Projection;

@Projection(name="embedJournalist", types = Article.class)
public interface EmbedJournalist {
    Long getId();
    String getTitle();
    String getContent();
    String getUrl();
    String getImage_url();
    String getDescription();
    Journalist getJournliast();
}
