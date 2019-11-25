package com.manthan.exception.test;

public class Paytm {
	void book(){
		System.out.println("book started");

		IRCTC i = new IRCTC();
		
		
			try {
				i.confirm();
				}
				
				catch(ArithmeticException E) {
					System.out.println("exception handled @ Paytm()");
		
				}
			

		System.out.println("book ended");
	}
}
