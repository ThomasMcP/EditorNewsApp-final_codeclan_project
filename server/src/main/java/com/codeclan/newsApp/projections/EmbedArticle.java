package com.codeclan.newsApp.projections;

        import com.codeclan.newsApp.models.Article;
        import com.codeclan.newsApp.models.Journalist;
        import org.springframework.data.rest.core.config.Projection;

@Projection(name="embedArticle", types = Journalist.class)
public interface EmbedArticle {
    String getName();
    Article getArticle();
}
