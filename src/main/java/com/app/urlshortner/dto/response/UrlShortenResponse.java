package com.app.urlshortner.dto.response;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;
import java.time.LocalDateTime;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UrlShortenResponse {

    private String shortCode;

    private String shortUrl; //the final shortened url

    private String originalUrl;

    private LocalDateTime createdAt;

    private LocalDateTime expiresAt;

}
