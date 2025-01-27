package com.ronapps.bloggingplatformapi.Configuration;

import com.ronapps.bloggingplatformapi.BlogPost;
import com.ronapps.bloggingplatformapi.Service.BloggingPlatformService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BloggingPlatformConfiguration {

    @Bean
    public BloggingPlatformService bloggingPlatformService() {
        return new BloggingPlatformService();
    }

    @Bean
    public BlogPost blogPost() {
        return new BlogPost();
    }

}
