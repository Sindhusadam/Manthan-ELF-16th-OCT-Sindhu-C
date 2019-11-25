package com.manthan.overloading.test;

public class DB {

	void save(Student stu) {
		System.out.println("******saving student db***********");
		System.out.println("name is" + stu.getName());
		System.out.println("is is" + stu.getId());
	}
}
