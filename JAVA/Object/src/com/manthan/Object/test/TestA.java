package com.manthan.Object.test;

public class TestA {

	public static void main(String[] args) {   
		Student s = new Student("sindhu",5,34.5);
		System.out.println(s);
		Student t = new Student("sindhu",5,34.5);
		System.out.println(t);
		boolean d = s.equals(t);
		System.out.println(d);
		
		
	}

}
