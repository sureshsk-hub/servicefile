package com.vedika.functionhall.exceptionapi;



import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionAdvice {
	
@ExceptionHandler()
public ResponseEntity<Exceptions> mapException(OwnerControllerException ex){
	Exceptions error =new Exceptions(HttpStatus.INTERNAL_SERVER_ERROR.value(),ex.getMessage());
	return new ResponseEntity<Exceptions>(error,HttpStatus.INTERNAL_SERVER_ERROR);
	
}
}