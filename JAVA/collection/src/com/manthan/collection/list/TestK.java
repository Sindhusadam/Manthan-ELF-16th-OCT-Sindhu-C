package com.manthan.collection.list;

import java.util.LinkedList;

public class TestK {

	public static void main(String[] args) {
		LinkedList al = new LinkedList();
		al.add(5);
		al.add('f');
		al.add(4.5);
		al.add("sindhu");

		for (int i = 0; i < al.size(); i++) {
			Object j = al.get(i);
			System.out.println(j);
		}

	}

}
