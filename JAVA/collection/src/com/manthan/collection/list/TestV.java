package com.manthan.collection.list;

import java.util.ListIterator;
import java.util.Vector;

public class TestV {

	public static void main(String[] args) {
		Vector<Character> v = new Vector<Character>();
		v.add('e');
		v.add('f');
		v.add('g');
		v.add('h');
		

		ListIterator<Character> i = v.listIterator(v.size());

		while (i.hasPrevious()) {
			Object r = i.previous();
			System.out.println(r);
	}

}
}
