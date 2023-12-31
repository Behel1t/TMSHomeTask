package com.example.lesson43bl.web;

import com.example.lesson43bl.exc.ErrorDetails;
import com.example.lesson43bl.exc.StoreFailedException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ControllerErrorHandler {
    @ExceptionHandler
    public ResponseEntity<ErrorDetails> handle(StoreFailedException exc){
        String errorMessage=exc.getErrorMessage();
        ErrorDetails errorDetails= ErrorDetails.builder()
                .serviceName("car-service")
                .message(errorMessage)
                .code(400)
                .build();
        return ResponseEntity.status(400).body(errorDetails);
    }
}
