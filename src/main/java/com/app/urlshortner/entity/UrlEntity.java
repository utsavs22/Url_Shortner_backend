package com.app.urlshortner.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.index.Indexed;
import lombok.Data;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.time.LocalDateTime;

/**
 * Entity class representing the structure of a URL record in the database.
 */
@Document(collection = "urls")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UrlEntity {
    
    @Id
    private String id;
    
    private String originalUrl;

    @Indexed(unique = true)
    private String shortUrl;

    private LocalDateTime createdAt;
    
    @Indexed(expireAfterSeconds = 0)
    private LocalDateTime expiresAt;
    
    private long clickCount;
    private boolean isActive;    
    // Add other fields (e.g., creation date, expiration date) and getters/setters here later

}
