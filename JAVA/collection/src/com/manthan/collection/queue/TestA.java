package com.manthan.collection.queue;

import java.util.PriorityQueue;

public class TestA {
public static void main(String[] args) {
	PriorityQueue<Double> p = new PriorityQueue<Double>();
	p.add(34.5);
	p.add(12.6);
	p.add(76.9);
	p.add(56.9);
	
	for (Double d : p) {
		System.out.println(d);
	}
	
	
	
}
}
