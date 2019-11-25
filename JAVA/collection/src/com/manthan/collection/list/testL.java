package com.manthan.collection.list;

import java.util.LinkedList;

public class testL {

	public static void main(String[] args) {
		LinkedList al = new LinkedList();
		al.add(5);
		al.add('f');
		al.add(4.5);
		al.add("sindhu");

		for (Object i : al) {
			System.out.println(i);
		}
	}

}
