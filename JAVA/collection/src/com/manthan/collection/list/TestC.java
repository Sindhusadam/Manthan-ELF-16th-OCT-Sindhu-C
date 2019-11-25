package com.manthan.collection.list;

import java.util.ArrayList;
import java.util.Iterator;

public class TestC {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(5);
		al.add('f');
		al.add(4.5);
		al.add("sindhu");
		
		Iterator i = al.iterator();
		
		while (i.hasNext()) {
			Object r = i.next();
			System.out.println(r);
			
		}
		}
	}

