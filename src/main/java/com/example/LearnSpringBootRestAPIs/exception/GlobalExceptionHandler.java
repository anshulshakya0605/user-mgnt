package com.example.LearnSpringBootRestAPIs.exception;

import io.jsonwebtoken.ExpiredJwtException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;


public class GlobalExceptionHandler {
    @ExceptionHandler(ExpiredJwtException.class)
    public ResponseEntity<String > handleExpiredToken() {
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Token Expired");
    }
}
