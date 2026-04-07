package com.app.urlshortner.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.time.LocalDateTime;

/**
 * Entity class representing the structure of a click record in the database.
 */
@Document(collection = "clicks")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Click {
    
    @Id
    private String id;
    
    private String shortUrl;
    
    private LocalDateTime clickedAt;
    
    private String ipHash; //sha-256 of IP 
    
    private String userAgent;
    
    private String referer;
    
    // Add getters and setters here later
}
