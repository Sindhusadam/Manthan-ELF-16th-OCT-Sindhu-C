package com.manthan.collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class TestA {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(2);
		hs.add("wjndk");
		hs.add('d');

		for (Object d : hs) {
			System.out.println(d);
		}

		Iterator i = hs.iterator();
		while(i.hasNext()){
			Object s = i.next();
			System.out.println(s);
		}
	}

}
