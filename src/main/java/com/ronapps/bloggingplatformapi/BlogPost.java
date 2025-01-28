package com.ronapps.bloggingplatformapi;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "BLOG_POST")
public class BlogPost {

    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String content;

    private String category;

    @ElementCollection
    private List<String> tags;

    public void setId(Long newID) {
        this.Id = newID;
    }

    public Long getId() {
        return  this.Id;
    }

    public void setContent(String newContent) {
        this.content = newContent;
    }

    public String getContent() {
        return this.content;
    }

    public void setCategory(String newCategory) {
        this.category = newCategory;
    }

    public String getCategory() {
        return this.category;
    }
/*
    public List<String> getAllTags() {
        return
    }

 */



}
