package com.manthan.overloading.test;

public class Train {
	void search(String name) {
		System.out.println("searching train by name" +  name);
	}

	void search(int num) {
		System.out.println("searching train by num" + num);
	}
}
