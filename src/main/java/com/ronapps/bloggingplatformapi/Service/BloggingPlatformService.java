package com.ronapps.bloggingplatformapi.Service;

import com.ronapps.bloggingplatformapi.BlogPost;
import com.ronapps.bloggingplatformapi.Repository.BloggingPlatformRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    public void addBlogPost(BlogPost newBlogPost) {
        bloggingPlatformRepository.save(newBlogPost);
    }

    @Transactional
    public void updateBlogPost(long id, BlogPost blogPost) {

    }

    public void removeBlogPostById(Long id) {
        bloggingPlatformRepository.deleteById(id);
    }
}
