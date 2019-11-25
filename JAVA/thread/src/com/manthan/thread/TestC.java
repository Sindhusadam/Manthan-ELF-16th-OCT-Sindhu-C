package com.manthan.thread;

public class TestC {

	public static void main(String[] args) {

		PVR i = new PVR();

		User t1 = new User(i);
		t1.start();




	}

}
