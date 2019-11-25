package com.manthan.collection.lamda;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public interface TestE {
	Comparator<Student> c = (o1,o2)-> {
		if(o1.percetage > o2.percetage)
		{
			return 1;
		}
		else if(o1.percetage < o2.percetage)
		{
			return -1;
		}
		else {
			return 0;
		}
	};


	Comparator<Student> cd = (o1,o2)-> {
		if(o1.percetage> o2.percetage)
		{
			return -1;
		}
		else if(o1.percetage < o2.percetage)
		{
			return 1;
		}
		else {
			return 0;	
		}
	};

	TreeSet<Student> t= new TreeSet<Student>(cd);

	Student s1 = new Student("sindhu", 5, 56.8);
	Student s2 = new Student("bindu", 9, 46.8);
	Student s3 = new Student("navya", 1, 89.87);
	Student s4 = new Student("kavya", 3, 90.8);

	t.add(s1);
	t.add(s2);
	t.add(s3);
	t.add(s4);

	Iterator<Student> i =  t.iterator();
	while(i.hasNext()){
		Student r = i.next();
		System.out.println(r.name);
		System.out.println(r.percetage);
		System.out.println(r.percetage);
	}
}
