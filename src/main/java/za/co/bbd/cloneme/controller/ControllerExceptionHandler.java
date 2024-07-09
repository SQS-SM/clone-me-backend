package za.co.bbd.cloneme.controller;

import java.io.IOException;
import java.sql.SQLException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import za.co.bbd.cloneme.model.exception.ClonemeException;

@RestControllerAdvice
public class ControllerExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(NumberFormatException.class)
    public ResponseEntity<String> handleNumberFormat(NumberFormatException numberFormatException) {
        return new ResponseEntity<String>(numberFormatException.getMessage(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(IOException.class)
    public ResponseEntity<String> handleIO(NumberFormatException ioException) {
        return new ResponseEntity<String>(ioException.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(SQLException.class)
    public ResponseEntity<String> handleSQL(SQLException sqlException) {
        return new ResponseEntity<String>(sqlException.getMessage(), HttpStatus.SERVICE_UNAVAILABLE);
    }

    @ExceptionHandler(NullPointerException.class)
    public ResponseEntity<String> handleNullPointer(NullPointerException nullPointerException) {
        return new ResponseEntity<String>(nullPointerException.getMessage(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(ClonemeException.class)
    public ResponseEntity<String> handleException(ClonemeException exception) {
        return new ResponseEntity<String>(exception.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
