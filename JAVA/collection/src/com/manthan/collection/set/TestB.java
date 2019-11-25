package com.manthan.collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class TestB {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("sudh");
		hs.add("wjndk");
		hs.add("nkdf");
		hs.add(null);



		for (String d : hs) {
			System.out.println(d);
		}



		Iterator<String> i = hs.iterator();
		while(i.hasNext()){
			String s = i.next();
			System.out.println(s);
		}
	}

}
