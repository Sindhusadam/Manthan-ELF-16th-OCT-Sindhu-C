package com.manthan.collection.list;

import java.util.Vector;

public class TestS {

	public static void main(String[] args) {
		Vector<Character> v = new Vector<Character>();
		v.add('e');
		v.add('f');
		v.add('g');
		v.add('h');
		
		for (int i = 0; i < v.size(); i++) {
			Character s = v.get(i);
			System.out.println(s);
	}

}
}
