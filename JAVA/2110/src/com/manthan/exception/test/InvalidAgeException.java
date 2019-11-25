package com.manthan.exception.test;    // //checked exception

public class InvalidAgeException extends Exception {
	String 	msg = "sorry u are too young";


	public InvalidAgeException() {

	}


	public InvalidAgeException(String msg) {
		this.msg = msg;
	}


	@Override
	public String getMessage() {
		//return super.getMessage();
		return msg;
	}
}
