package com.ronapps.bloggingplatformapi.Repository;

import com.ronapps.bloggingplatformapi.BlogPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BloggingPlatformRepository extends JpaRepository<BlogPost, Long> {

}
