package com.ronapps.bloggingplatformapi.Service;

import com.ronapps.bloggingplatformapi.BlogPost;
import com.ronapps.bloggingplatformapi.Repository.BloggingPlatformRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BloggingPlatformService {

    private final BloggingPlatformRepository bloggingPlatformRepository;

    @Autowired
    public BloggingPlatformService(BloggingPlatformRepository bloggingPlatformRepository) {
        this.bloggingPlatformRepository = bloggingPlatformRepository;
    }

    public void addBlogPost(BlogPost newBlogPost) {
        bloggingPlatformRepository.save(newBlogPost);
    }
}
