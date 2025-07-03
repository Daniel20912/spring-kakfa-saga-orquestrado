package br.com.microservices.orchestrated.orderservice.config.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import static org.springframework.http.HttpStatus.BAD_REQUEST;
import static org.springframework.http.HttpStatus.valueOf;

@ControllerAdvice
public class ExceptionGlobalHandler {

    @ExceptionHandler(ValidationException.class)
    public ResponseEntity<?> handleValidationException(ValidationException ValidationException) {
        var details = new ExceptionDetails(BAD_REQUEST.value(), ValidationException.getMessage());
        return new  ResponseEntity<>(details, BAD_REQUEST);
    }
}
