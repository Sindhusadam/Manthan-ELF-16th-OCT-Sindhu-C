package com.manthan.collection.list;

import java.util.Iterator;
import java.util.LinkedList;

public class TestM {

	public static void main(String[] args) {
		LinkedList al = new LinkedList();
		al.add(5);
		al.add('f');
		al.add(4.5);
		al.add("sindhu");

		Iterator i = al.iterator();
		while(i.hasNext()) {
			Object o = i.next();
			System.out.println(o);
				}
	}

}
