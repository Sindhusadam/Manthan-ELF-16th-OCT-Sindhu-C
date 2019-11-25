package com.manthan.collection.list;

import java.util.ArrayList;

public class TestB {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(5);
		al.add('f');
		al.add(4.5);
		al.add("sindhu");

		for (Object a : al) {
			System.out.println(a);
		}
	}

}
