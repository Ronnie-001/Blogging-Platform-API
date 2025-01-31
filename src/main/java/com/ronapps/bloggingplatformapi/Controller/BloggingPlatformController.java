package com.ronapps.bloggingplatformapi.Controller;

import com.ronapps.bloggingplatformapi.BlogPost;
import com.ronapps.bloggingplatformapi.Service.BloggingPlatformService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public BlogPost createBlogPost(@RequestBody BlogPost blogPost) {
        bloggingPlatformService.addBlogPost(blogPost);
        return blogPost;
    }

    @DeleteMapping("/delete/{id}")
    public String deleteBlogPost(@PathVariable long id) {
        bloggingPlatformService.removeBlogPostById(id);
        return "Blog post has been deleted!";
    }

    @PutMapping("update/{id}")
    public BlogPost updateBlogPost(@PathVariable long id, @RequestBody BlogPost updatedBlogPost) {
        // TODO: Find out how to update an entity within a database
        updatedBlogPost.setId(id);
        bloggingPlatformService.addBlogPost(updatedBlogPost);
        return updatedBlogPost;
    }
}
