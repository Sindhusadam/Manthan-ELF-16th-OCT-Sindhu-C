package com.manthan.exception.test;

public class TestA {
	public static void main(String[] args) {

		System.out.println("main strats");

		try {
			System.out.println(10/2);
		}
		catch(ArithmeticException e){
			System.out.println("do not devide by zero");
		}
		System.out.println("main ends");
	}
}
