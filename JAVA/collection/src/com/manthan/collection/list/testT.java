package com.manthan.collection.list;

import java.util.Vector;

public class testT {

	public static void main(String[] args) {
		Vector<Character> v = new Vector<Character>();
		v.add('e');
		v.add('f');
		v.add('g');
		v.add('h');
		
		for (Character s : v) {
			System.out.println(s);
		}
	}

}
