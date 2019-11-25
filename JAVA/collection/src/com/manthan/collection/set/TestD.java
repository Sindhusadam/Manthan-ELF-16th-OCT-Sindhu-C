package com.manthan.collection.set;

import java.util.HashSet;

public class TestD {

	public static void main(String[] args) {
		HashSet<Person> ha =  new HashSet<Person>();

		Person p1 = new Person("lipi",1,121);
		Person p2 = new Person("lays",2,125);
		Person p3 = new Person("lilly",3,171);
		Person p4 = new Person("siliy",4,191);
		Person p5 = new Person("silly",4,191);

		ha.add(p1);
		ha.add(p2);
		ha.add(p3);
		ha.add(p4);
		ha.add(p5);
		

		for (Person p : ha) {
			System.out.println(p.height);
			System.out.println(p.id);
			System.out.println(p.name);
		}
	}

}
