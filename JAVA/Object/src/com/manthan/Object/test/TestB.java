package com.manthan.Object.test;

public class TestB {

	public static void main(String[] args) {
		Animal a=new Cow();      //upcasting
		a.cost=12;
		a.eat();
		System.out.println(a.cost);
		
		
		Cow c = (Cow)a; //downcasting
		c.cost=45;
		c.size=34.5;
		c.eat();
		c.run();
		System.out.println(c.cost);
		System.out.println(c.size);

	}

}
