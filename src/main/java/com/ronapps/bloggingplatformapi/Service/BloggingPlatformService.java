package com.ronapps.bloggingplatformapi.Service;

import com.ronapps.bloggingplatformapi.BlogPost;
import com.ronapps.bloggingplatformapi.Repository.BloggingPlatformRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BloggingPlatformService {

    private final BloggingPlatformRepository bloggingPlatformRepository;

    @Autowired
    public BloggingPlatformService(BloggingPlatformRepository bloggingPlatformRepository) {
        this.bloggingPlatformRepository = bloggingPlatformRepository;
    }

    public BlogPost getBlogPost(long id) {
        return bloggingPlatformRepository.findById(id).get();
    }

    // also used for updating blog posts in the database
    public BlogPost addBlogPost(BlogPost newBlogPost) {
        bloggingPlatformRepository.save(newBlogPost);
        return newBlogPost;
    }

    public void removeBlogPostById(Long id) {
        bloggingPlatformRepository.deleteById(id);
    }

    public List<BlogPost> getAllBlogPosts() {
        return bloggingPlatformRepository.findAll();
    }
}
