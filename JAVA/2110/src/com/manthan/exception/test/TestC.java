package com.manthan.exception.test;

public class TestC {
	public static void main(String[] args) {

		System.out.println("main strats");
		
		String name = null;

		try {
			System.out.println(10/0);
			System.out.println("hi");
			System.out.println("have a good day");
			System.out.println(name.length());

		}
		catch(ArithmeticException e){

			System.out.println("do not devide by zero");
		}
		catch(NullPointerException a){

			System.out.println("do not deal with null");
		}
		System.out.println("main ends");
	}

}

