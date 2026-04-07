package com.app.urlshortner.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UrlShortenRequestdto {

    @NotBlank(message = "URL cannot be blank")
    @org.hibernate.validator.constraints.URL(message = "Must be a valid URL")
    private String originalUrl;

    private String customAlias;

    private LocalDateTime expiresAt;

    
}
