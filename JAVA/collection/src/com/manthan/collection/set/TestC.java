package com.manthan.collection.set;

import java.util.Iterator;
import java.util.LinkedHashSet;


public class TestC {

	public static void main(String[] args) {
		LinkedHashSet l = new LinkedHashSet(); 
		l.add(2);
		l.add("wjndk");
		l.add('d');
		l.add(null);


		for (Object d : l) {
			System.out.println(d);
		}

		Iterator i = l.iterator();
		while(i.hasNext()){
			Object s = i.next();
			System.out.println(s);
		}
	}

}
