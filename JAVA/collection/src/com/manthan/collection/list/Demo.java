package com.manthan.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Demo {
	public static void main(String[] args) {


		ArrayList<Student> al = new ArrayList<Student>();

		Student s1 =new Student("sindhu",1,98.5);
		Student s2 =new Student("bindhu",2,23.5);
		Student s3 =new Student("indhu",3,86.5);
		Student s4 =new Student("chandu",4,56.9);

		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);

		for (int i = 0; i < al.size(); i++) {
			Student s = al.get(i);
			System.out.println(s.id);
			System.out.println(s.name);
			System.out.println(s.per);
		}

		System.out.println("---------------------------------------");

		for (Student s : al) {
			System.out.println(s.id);
			System.out.println(s.name);
			System.out.println(s.per);
		}

		System.out.println("---------------------------------------");

		Iterator<Student> i = al.iterator();
		while(i.hasNext()) {
			Student s = i.next();
			System.out.println(s.id);
			System.out.println(s.name);
			System.out.println(s.per);
		}
		System.out.println("---------------------------------------");
		
		ListIterator<Student> i1 = al.listIterator(al.size());

		while (i1.hasPrevious()) {
			Student r = i1.previous();
			System.out.println(r.id);
			System.out.println(r.name);
			System.out.println(r.per);
		}

	}
}

