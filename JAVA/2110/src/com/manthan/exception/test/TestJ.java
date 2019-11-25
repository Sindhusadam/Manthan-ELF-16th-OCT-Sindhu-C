package com.manthan.exception.test;

public class TestJ {
	public static void main(String[] args) {

		AgeSimulator a = new AgeSimulator();
		try {
			a.verify(12);
			System.out.println("u can enter");
		} 
		catch (InvalidAgeException e) {
			e.printStackTrace();
		}
	}
}
