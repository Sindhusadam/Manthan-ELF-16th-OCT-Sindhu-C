package com.manthan.collection.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class TestW {

	public static void main(String[] args) {
		Collection<Double> al =new ArrayList<Double>();
		al.add(34.2);
		al.add(12.3);
		al.add(76.5);
		al.add(89.7);
		

		Iterator<Double> d = al.iterator();
		while(d.hasNext())
		{
			Double r= d.next();
			System.out.println(r);
		}


	}

}
