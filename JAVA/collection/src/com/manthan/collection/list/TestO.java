package com.manthan.collection.list;

import java.util.LinkedList;

public class TestO {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("sindhu");
		ll.add("lipi");
		ll.add("akjk");
		ll.add("gtgio");

		for (int i = 0; i < ll.size(); i++) {
			String s = ll.get(i);
			System.out.println(s);
		}
	}

}
