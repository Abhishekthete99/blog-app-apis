package com.abhishek.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.abhishek.payloads.ApiResponse;

@RestControllerAdvice
public class GlobalExceptionHandeler {

	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<ApiResponse> resourceNotFoundExceptionHandeler(ResourceNotFoundException ex){
	String messeage = ex.getMessage();
	ApiResponse apiResponse = new ApiResponse();
	return new ResponseEntity<ApiResponse>(apiResponse, HttpStatus.NOT_FOUND);
    }
}
