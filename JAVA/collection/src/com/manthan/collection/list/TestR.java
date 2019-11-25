package com.manthan.collection.list;

import java.util.LinkedList;
import java.util.ListIterator;

public class TestR {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("sindhu");
		ll.add("lipi");
		ll.add("akjk");
		ll.add("gtgio");

		ListIterator<String> i = ll.listIterator(ll.size());

		while (i.hasPrevious()) {
			Object r = i.previous();
			System.out.println(r);
		}
	}
}
