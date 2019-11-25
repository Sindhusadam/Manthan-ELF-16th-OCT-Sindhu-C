package com.manthan.thread;

public class TestD {

	public static void main(String[] args) {
		Pen p =new Pen();
		Thread t1 = new Thread(p);
		t1.start();
	}

}
