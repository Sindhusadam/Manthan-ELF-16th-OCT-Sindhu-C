package com.manthan.collection.list;

import java.util.ArrayList;
import java.util.ListIterator;

public class testJ {

	public static void main(String[] args) {
		ArrayList<Double> al = new ArrayList<Double>();

		al.add(2.4);
		al.add(5.8);
		al.add(3.6);
		al.add(4.1);

		ListIterator<Double> i = al.listIterator(al.size());

		while (i.hasPrevious()) {
			Object r = i.previous();
			System.out.println(r);

		}
	}

}
