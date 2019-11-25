package com.manthan.exception.test;

public class TestF {

	public static void main(String[] args) {

		System.out.println("main started");


		Paytm P = new Paytm();
		
		try {
			P.book();
			}
			
			catch(ArithmeticException E) {
				System.out.println("exception handled @ confirm()");
				
			}
		
		System.out.println("main ends");
	}

}
