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

    @Column(name= "content")
    private String content;

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



}
