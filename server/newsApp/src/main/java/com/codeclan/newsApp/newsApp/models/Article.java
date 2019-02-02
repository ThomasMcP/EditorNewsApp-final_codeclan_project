package com.codeclan.newsApp.newsApp.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "articles")
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    private String title;

    @ManyToOne
    @JoinColumn(name = "journalist_id", nullable = false)
    private Journalist journalist;

    @Column(name = "description")
    private String description;

    @Column(name = "url")
    private String url;

    @Column(name = "date")
    private Date date;
//    THIS IS YYYY/MM/DD

    @Column(name = "content")
    private String content;

    @Column(name = "imageLink")
    private String imageLink;

    public Article(String title, Journalist journalist, String description, String url, Date date, String content, String imageLink) {
        this.title = title;
        this.journalist = journalist;
        this.description = description;
        this.url = url;
        this.date = new Date();
        this.content = content;
        this.imageLink = imageLink;
    }

    public Article() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Journalist getJournalist() {
        return journalist;
    }

    public void setJournalist(Journalist journalist) {
        this.journalist = journalist;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImageLink() {
        return imageLink;
    }

    public void setImageLink(String imageLink) {
        this.imageLink = imageLink;
    }
}


