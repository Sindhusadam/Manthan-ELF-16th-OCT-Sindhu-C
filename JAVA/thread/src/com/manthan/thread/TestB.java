package com.manthan.thread;

public class TestB {

	public static void main(String[] args) {
		 System.out.println("main started");
		 
          MyTask t1 =new  MyTask();
          t1.start();
          
          System.out.println("main ended");
	}

}
