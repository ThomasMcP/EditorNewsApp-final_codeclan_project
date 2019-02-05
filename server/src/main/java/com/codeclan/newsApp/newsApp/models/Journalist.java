package com.codeclan.newsApp.newsApp.models;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "journalists")
public class Journalist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

//    @JsonIgnore
//    @OneToMany(mappedBy = "journalist", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//    private List<Article> articles;

    public Journalist(String name) {
        this.name = name;
//        this.articles = new ArrayList<>();
    }

    public Journalist() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

//    public void addArticle(Article article){
//        this.articles.add(article);
//    }
//
//    public int countArticles(){
//        return this.articles.size();
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public List<Article> getArticles() {
//        return articles;
//    }
//
//    public void setArticles(List<Article> articles) {
//        this.articles = articles;
//    }
}