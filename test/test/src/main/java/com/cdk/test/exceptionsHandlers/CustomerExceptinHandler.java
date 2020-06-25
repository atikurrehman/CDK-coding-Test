package com.cdk.test.exceptionsHandlers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CustomerExceptinHandler {

	@ExceptionHandler(NoCustomerFoundException.class)
	@ResponseStatus(reason = "Customer not found", value = HttpStatus.NOT_FOUND)
	public void handleNoCustomerFoundException() {

	}

}
