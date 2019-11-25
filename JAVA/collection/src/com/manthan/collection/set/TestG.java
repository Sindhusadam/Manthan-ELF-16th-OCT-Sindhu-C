package com.manthan.collection.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestG {

	public static void main(String[] args) {
		StudentById c = new StudentById();
		StudentByPer v = new StudentByPer();
		TreeSet<Student> t= new TreeSet<Student>(v);

		Student s1 = new Student("sindhu", 5, 56.8);
		Student s2 = new Student("bindu", 9, 46.8);
		Student s3 = new Student("navya", 1, 89.87);
		Student s4 = new Student("kavya", 3, 90.8);

		t.add(s1);
		t.add(s2);
		t.add(s3);
		t.add(s4);

		Iterator<Student> i =  t.iterator();
		while(i.hasNext()){
			Student s = i.next();
			System.out.println(s.id);
			System.out.println(s.name);
			System.out.println(s.percetage);
		}

	}

}
