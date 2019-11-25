package com.manthan.exception.test;

public class TestE {

	public static void main(String[] args) {
		System.out.println("main strats");
		int a[] =new int[3];
		String name = null;

		try {
			System.out.println(a[5]);
			System.out.println(10/0);
			System.out.println("HI");
			System.out.println("have a good day");
			System.out.println(name.length());

		}
		catch(ArithmeticException e){

			System.out.println("do not devide by zero");
		}
		catch(NullPointerException b){

			System.out.println("do not deal with null");
		}
		catch(ArrayIndexOutOfBoundsException ar){

			System.out.println("dont cross array boundry");
		}
		catch(Exception s) {
			System.out.println("general catch block");
		}
		System.out.println("main ends");
	}

}
