package com.ronapps.bloggingplatformapi.Controller;

import com.ronapps.bloggingplatformapi.BlogPost;
import com.ronapps.bloggingplatformapi.Service.BloggingPlatformService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/posts")
public class BloggingPlatformController {

    private final BloggingPlatformService bloggingPlatformService;

    private final BlogPost blogPost;

    @Autowired
    public BloggingPlatformController(BloggingPlatformService bloggingPlatformService, BlogPost blogPost) {
        this.bloggingPlatformService = bloggingPlatformService;
        this.blogPost = blogPost;
    }

    @GetMapping
    public String instruct() {
        return "Create a blog post!";
    }

    @PostMapping
    public void createBlogPost(@RequestBody BlogPost blogPost) {
        // TODO: After they send info in the form of the BlogPost POJO, add to the data base
        // TODO: Return the Same POJO with the time it was created and updated
    }

}
