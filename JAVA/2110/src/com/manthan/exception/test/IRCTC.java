package com.manthan.exception.test;

public class IRCTC {
	void confirm(){
		System.out.println("confirm started");

		try {
			System.out.println(10/2);
			}
			
			catch(ArithmeticException E) {
				System.out.println("exception handled @ confirm()");
				throw E;
			}
        
finally {
		System.out.println("confirm ended");
}
	}
}
