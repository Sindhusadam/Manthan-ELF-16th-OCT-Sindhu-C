package com.manthan.collection.list;

import java.util.Iterator;
import java.util.LinkedList;

public class TestQ {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("sindhu");
		ll.add("lipi");
		ll.add("akjk");
		ll.add("gtgio");

		Iterator<String> i = ll.iterator();
		while(i.hasNext()) {
			String s = i.next();
			System.out.println(s);
		}
	}

}
