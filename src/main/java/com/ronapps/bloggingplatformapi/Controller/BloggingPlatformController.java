package com.ronapps.bloggingplatformapi.Controller;

import com.ronapps.bloggingplatformapi.BlogPost;
import com.ronapps.bloggingplatformapi.Service.BloggingPlatformService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/posts")
public class BloggingPlatformController {

    private final BloggingPlatformService bloggingPlatformService;

    @Autowired
    public BloggingPlatformController(BloggingPlatformService bloggingPlatformService) {
        this.bloggingPlatformService = bloggingPlatformService;
    }

    @GetMapping
    public String instruct() {
        return "Create a blog post!";
    }

    @PostMapping
    public BlogPost createBlogPost(@RequestBody BlogPost blogPost) {
        return bloggingPlatformService.addBlogPost(blogPost);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteBlogPost(@PathVariable long id) {
        bloggingPlatformService.removeBlogPostById(id);
        return "Blog post has been deleted!";
    }

    @PutMapping("update/{id}")
    public BlogPost updateBlogPost(@PathVariable long id, @RequestBody BlogPost updatedBlogPost) {
        BlogPost existingBlogPost = bloggingPlatformService.getBlogPost(id);
        existingBlogPost.setTitle(updatedBlogPost.getTitle());
        existingBlogPost.setCategory(updatedBlogPost.getCategory());
        existingBlogPost.setContent(updatedBlogPost.getContent());
        existingBlogPost.setTags(updatedBlogPost.getTags());

        bloggingPlatformService.addBlogPost(existingBlogPost);
        return existingBlogPost;
    }

    @GetMapping("/all")
    public List<BlogPost> getAllBlogPosts() {
        return bloggingPlatformService.getAllBlogPosts();
    }
}
