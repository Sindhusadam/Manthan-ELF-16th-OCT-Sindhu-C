package com.manthan.exception.test;

public class TestB {
	public static void main(String[] args) {

		System.out.println("main starts");

		String name = null;
		try {
			System.out.println(name.length());
		}
		catch(NullPointerException e){
			System.out.println("do not deal with null");
		}

		System.out.println("main ends");

	}

}
