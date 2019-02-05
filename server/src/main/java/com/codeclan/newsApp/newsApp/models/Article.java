
package com.codeclan.newsApp.newsApp.models;

import javax.persistence.*;
import java.util.GregorianCalendar;

@Entity
@Table(name = "articles")
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "image_url")
    private String image_url;

    @Column(name = "content")
    private String content;

    @Column(name = "url")
    private String url;

    @Column(name = "date ")
    private GregorianCalendar date;

    @Column(name= "description")
    private String description;

    @Column(name = "author")
    private String author;

//    @ManyToOne
//    @JoinColumn(name = "journalist_id", nullable = false)
//    private Journalist journalist;

    public Article(String title, String content,
                   String url, String image_url , GregorianCalendar date, String description, String author) {
        this.title = title;
        this.content = content;
        this.url = url;
        this.image_url = image_url;
        this.date = date;
        this.description = description;
        this.author = author;
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

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public GregorianCalendar getDate(){
        return date;
    }

    public void setDate(GregorianCalendar date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
