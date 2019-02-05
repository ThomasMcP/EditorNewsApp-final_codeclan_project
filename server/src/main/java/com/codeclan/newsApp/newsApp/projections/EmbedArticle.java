package com.codeclan.newsApp.newsApp.projections;

        import com.codeclan.newsApp.newsApp.models.Article;
        import com.codeclan.newsApp.newsApp.models.Journalist;
        import org.springframework.data.rest.core.config.Projection;

@Projection(name="embedArticle", types = Journalist.class)
public interface EmbedArticle {
    String getName();
    Article getArticle();
}
