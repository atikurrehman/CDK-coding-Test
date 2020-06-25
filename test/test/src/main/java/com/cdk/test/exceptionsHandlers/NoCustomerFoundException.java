package com.cdk.test.exceptionsHandlers;

public class NoCustomerFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	public NoCustomerFoundException() {
		super("No customer Found");
	}
	public NoCustomerFoundException(String string) {
		super(string);
	}

}
