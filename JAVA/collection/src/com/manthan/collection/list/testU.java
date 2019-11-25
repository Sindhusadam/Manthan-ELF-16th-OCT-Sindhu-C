package com.manthan.collection.list;

import java.util.Iterator;
import java.util.Vector;

public class testU {

	public static void main(String[] args) {
		Vector<Character> v = new Vector<Character>();
		v.add('e');
		v.add('f');
		v.add('g');
		v.add('h');
		
		Iterator<Character> i = v.iterator();
		while(i.hasNext()) {
			Character s = i.next();
			System.out.println(s);
	}

}
}