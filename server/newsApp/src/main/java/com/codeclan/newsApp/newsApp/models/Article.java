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

    @Column(name = "description")
    private String description;

    @Column(name= "category")
    private String category;

    @Column(name="url")
    private String url;

    @Column(name="imageURL")
    private String imageLink;

    @Column(name="datetime")
    private String datetime;//(String for now) maybe
    // change to timestamp later and use
    // compareTo() method for sorting and to help map most viewers)

    @ManyToOne
    @JoinColumn(name = "journalist_id", nullable = false)
    private  Journalist journalist;


    public Article(String title, String description,
                   String category, String url, String imageLink){ //String date
        this.title = title;
        this.description = description;
        this.category = category;
        this.url = url;
//      this.datetime = datetime;
        this.imageLink = imageLink;
        this.journalist = journalist;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category ){
        this.category = category;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getImageLink() {
        return imageLink;
    }

    public void setImageLink(String imageLink) {
        this.imageLink = imageLink;
    }


    public Journalist getJournalist() {
        return journalist;
    }

//    public String getDatetime() {
//        return datetime;
//    }

//    public void setDatetime(String datetime) {
//        this.datetime = datetime;
//    }

}
