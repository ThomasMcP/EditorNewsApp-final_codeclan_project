package com.codeclan.newsApp.newsApp.models;

import javax.persistence.*;

@Entity
@Table(name = "articles")
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="title")
    private String title;

    @Column(name="Category")
    private Category category;

    @Column(name = "description")
    private String description;

    @Column(name="url")
    private String url;

    @Column(name="datetime")
    private String datetime;//(String for now) maybe
    // change to timestamp later and use
    // compareTo() method for sorting and to help map most viewers)

    @ManyToOne
    @JoinColumn(name = "journalist_id", nullable = false)
    private Journalist journalist;

    public Article(Long id, String title, Category category, String description,
                   String url, Journalist journalist){ //String date
        this.id = id;
        this.title = title;
        this.description = description;
        this.url = url;
//      this.datetime = datetime;
        this.journalist = journalist;
        this.category = category;
    }

    public Article(){

    }

    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
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


    public Journalist getJournalist() {
        return journalist;
    }

//    public void setJournalist(Journalist journalist){
//        this.journalist = journalist;
//    }

//    public String getDatetime() {
//        return datetime;
//    }

//    public void setDatetime(String datetime) {
//        this.datetime = datetime;
//    }

}
