package com.example.demo.RestApi;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptHand {

@ExceptionHandler(InvalidInputException.class)
    public ResponseEntity<ErrorResponse> handleinvalidInput(InvalidInputException i){
ErrorResponse error=new ErrorResponse("Invalid input",i.getMessage());
return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);

}
}
