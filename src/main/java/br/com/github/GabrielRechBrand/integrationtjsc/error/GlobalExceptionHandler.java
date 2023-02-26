package br.com.github.GabrielRechBrand.integrationtjsc.error;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    public static final String ERROR_MESSAGE = "Erro: ";

    @ExceptionHandler
    public ResponseEntity<String> handleException(HttpMessageNotReadableException e) {
        return new ResponseEntity<>(ERROR_MESSAGE.concat("JSON Mal formatado"), HttpStatus.BAD_REQUEST);
    }

}
