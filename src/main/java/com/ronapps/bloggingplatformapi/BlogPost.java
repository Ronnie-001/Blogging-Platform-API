package com.ronapps.bloggingplatformapi;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "BLOG_POST")
public class BlogPost {

    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String content;

    private String category;

    @ElementCollection
    private List<String> tags;

    @Version
    private Integer version;

    public BlogPost() {
        this.version = 0;
    }
    
    public String getTitle() {
        return this.title;
    }

    public void setTitle(String newTitle) {
        this.title = newTitle;
    }

    public void setId(Long newID) {
        this.id = newID;
    }

    public Long getId() {
        return  this.id;
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

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }
}
