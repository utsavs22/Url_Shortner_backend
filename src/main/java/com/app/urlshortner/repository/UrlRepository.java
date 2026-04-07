package com.app.urlshortner.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.app.urlshortner.entity.UrlEntity;
import java.util.Optional;

/**
 * Repository interface for database operations related to the UrlEntity.
 */
@Repository
public interface UrlRepository extends MongoRepository<UrlEntity, String> {
    
    // Add custom query methods here later, like findByShortUrl(String shortUrl)  
    Optional<UrlEntity> findByShortUrl(String shortUrl);

    boolean existsByShortUrl(String shortUrl);
    
    Optional<UrlEntity> findByOriginalUrl(String originalUrl);
}
