package com.manthan.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class testA {

	public static void main(String[] args) {
		HashMap<Character, String> hm = new HashMap<Character, String>();
		hm.put('s', "sushi");
		hm.put('v', "vinu");
		hm.put('k', "kalki");
		hm.put('d', "dan");

		Set<Map.Entry<Character,String>> s= hm.entrySet();

		for (Map.Entry<Character, String> i : s) {

			Character k = i.getKey();
			String r = i.getValue();
			
			System.out.println(k);
			System.out.println(r);
		}

	}

}
