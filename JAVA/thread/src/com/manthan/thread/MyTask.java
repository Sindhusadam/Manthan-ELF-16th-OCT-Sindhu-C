package com.manthan.thread;

public class MyTask extends Thread{
@Override
public void run() {
	
	for (int i = 0; i < 5; i++) {
		System.out.println(i);
	}
}
}
