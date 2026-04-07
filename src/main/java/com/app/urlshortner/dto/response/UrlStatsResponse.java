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
public class UrlStatsResponse {

    private String shortCode;

    private String originalUrl;

    private String shortUrl;

    private long clickCount;

    private LocalDateTime createdAt;

    private LocalDateTime expiresAt;

    private boolean isActive;

}
