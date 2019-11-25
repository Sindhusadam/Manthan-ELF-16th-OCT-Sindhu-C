package com.manthan.exception.test;        //unchecked exception

public class DayLimitException extends RuntimeException {

	String message = "sorry u crossed day limit ";

	public DayLimitException() {
	}

	public DayLimitException(String message) {
		this.message = message;
	}



	public String getMessage() {
		return message;
	}
}
