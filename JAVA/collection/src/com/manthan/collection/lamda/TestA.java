package com.manthan.collection.lamda;

public class TestA {

	public static void main(String[] args) {
		Penn p = (a,b) -> a+b;

		int y =p.add(20,10);
		System.out.println(y);
		
		Penn q = (a,b) -> a*b;

		int x =q.add(20,10);
		System.out.println(x);
	};

}
