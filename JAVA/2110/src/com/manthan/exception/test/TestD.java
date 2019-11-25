package com.manthan.exception.test;

public class TestD {
	public static void main(String[] args) {
		int a[] =new int[3];

		System.out.println("main strats");

		try {
			System.out.println(a[5]);
		}
		catch(ArrayIndexOutOfBoundsException ar){

			System.out.println("dont cross array boundry");
		}
		System.out.println("main ends");
	}

}
