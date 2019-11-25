package com.manthan.thread;

public class User extends Thread {
	PVR p;

	public User(PVR p) {
		this.p = p;
	}

	public void run() {
		p.confirm();
	}
}
