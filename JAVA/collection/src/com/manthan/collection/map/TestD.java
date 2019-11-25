package com.manthan.collection.map;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
import java.util.Hashtable;

public class TestD {
	public static void main(String[] args) {
		Hashtable<String, Integer> h = new Hashtable<String, Integer>();
		h.put("anil", 6);
		h.put("navya", 8);
		h.put("yash", 1);
		h.put("naveen", 4);

		Set<Map.Entry<String,Integer>> s= h.entrySet();

		for (Map.Entry<String, Integer> i : s) {

			String k = i.getKey();
			Integer r = i.getValue();

			System.out.println(k);
			System.out.println(r);
		}
	}
}
