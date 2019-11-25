package com.manthan.collection.list;

import java.util.ListIterator;
import java.util.LinkedList;

public class TestN {

	public static void main(String[] args) {
		LinkedList al = new LinkedList();
		al.add(5);
		al.add('f');
		al.add(4.5);
		al.add("sindhu");

		ListIterator i = al.listIterator();
		while(i.hasNext()) {
			Object o = i.next();
			System.out.println(o);
		}


}
}