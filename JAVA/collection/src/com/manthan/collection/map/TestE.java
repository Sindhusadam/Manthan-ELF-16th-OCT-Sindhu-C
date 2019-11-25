package com.manthan.collection.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestE {

	public static void main(String[] args) {
		
		ArrayList<Student> e1 = new ArrayList<Student>();
		
		Student s1 = new Student("sindhu",3,12.3);
		Student s2 = new Student("amy",5,47.8);
		Student s3 = new Student("elle",1,84.7);
		Student s4 = new Student("alaia",8,88.7);
		
		e1.add(s1);
		e1.add(s2);
		e1.add(s3);
		e1.add(s4);
		
		ArrayList<Student> e2 = new ArrayList<Student>();
		Student s5 = new Student("amy",5,47.8);
		Student s6 = new Student("elle",1,84.7);
		Student s7 = new Student("alaia",8,88.7);
		
		e2.add(s5);
		e2.add(s6);
		e2.add(s7);
		
		ArrayList<Student> e3 = new ArrayList<Student>();
		Student s8 = new Student("amy",5,47.8);
		Student s9 = new Student("elle",1,84.7);
		
		
		e3.add(s8);
		e3.add(s9);
		
		
		
		
		HashMap<String, ArrayList<Student>> hm = new HashMap<String, ArrayList<Student>>();
		
		hm.put("first",e1);
		hm.put("second",e2);
		hm.put("third",e3);
		
		Set<Map.Entry<String, ArrayList<Student>>> r = new Set<Map.Entry<String, ArrayList<Student>>>();
		
		for (Map.Entry<String, ArrayList<Student>> e : r) {
			String Key = e.getKey();
			ArrayList<Student> a = e.getValue();
			
			System.out.println(a);
			
			Iterator<Student> i = 
			
			
			
			
		}
		


	}

}
