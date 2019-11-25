package com.manthan.collection.list;

import java.util.ArrayList;
import java.util.ListIterator;

public class TestD {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(5);
		al.add('f');
		al.add(4.5);
		al.add("sindhu");

		ListIterator i = al.listIterator();

		while (i.hasNext()) {
			Object r = i.next();
			System.out.println(r);

		}


		while (i.hasPrevious()) {
			Object r = i.previous();
			System.out.println(r);

		}
	}

}
