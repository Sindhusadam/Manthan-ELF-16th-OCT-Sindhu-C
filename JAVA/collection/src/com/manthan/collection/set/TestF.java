package com.manthan.collection.set;

import java.util.TreeSet;

public class TestF {

	public static void main(String[] args) {

		TreeSet<Person> t = new TreeSet<Person>();

		Person p1 = new Person("lipi",1,121);
		Person p2 = new Person("lays",2,15);
		Person p3 = new Person("lilly",3,171);
		Person p4 = new Person("siliy",4,151);

		t.add(p1);
		t.add(p2);
		t.add(p3);
		t.add(p4);

		for (Person s : t) {
			System.out.println(s.name);
			System.out.println(s.id);
			System.out.println(s.height);
		}


	}

}
