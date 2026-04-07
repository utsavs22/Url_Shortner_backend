package com.app.urlshortner.exception;

public class UrlInactiveException extends RuntimeException {
    public UrlInactiveException(String message) {
        super(message);
    }
}
