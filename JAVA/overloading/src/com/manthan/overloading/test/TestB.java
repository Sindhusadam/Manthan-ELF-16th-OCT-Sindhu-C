package com.manthan.overloading.test;

public class TestB {

	public static void main(String[] args) {

		Student s= new Student();
		s.setName("sindhu");
		s.setId(12);

		DB b= new DB();
		b.save(s);
	}

}
