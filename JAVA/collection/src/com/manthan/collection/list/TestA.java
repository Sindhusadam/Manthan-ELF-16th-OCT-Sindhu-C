package com.manthan.collection.list;

import java.util.ArrayList;

public class TestA {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(5);
		al.add('f');
		al.add(4.5);
		al.add("sindhu");


		for (int i = 0; i < al.size(); i++) {
			Object o = al.get(i);
			System.out.println(o);
		}

		}
	}


