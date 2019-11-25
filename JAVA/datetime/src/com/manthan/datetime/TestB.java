package com.manthan.datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TestB {

	public static void main(String[] args) {
		
		LocalDateTime ld = LocalDateTime.now();
		DateTimeFormatter dt = DateTimeFormatter.ofPattern("DD-MM-YYYY");
		String s = dt.format(ld);
		System.out.println(s);
	}

}
