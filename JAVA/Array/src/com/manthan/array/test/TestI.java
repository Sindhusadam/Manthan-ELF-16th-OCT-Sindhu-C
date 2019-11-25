package com.manthan.array.test;

public class TestI {

	public static void main(String[] args) {
		Student[] s = new Student[4];

		Student s1 = new Student("anitha",1,34.5);
		Student s2 = new Student("kavtha",3,78.9);
		Student s3 = new Student("ani",7,67.0);
		Student s4 = new Student("vinutha",5,56.8);

		s[0] = s1;
		s[1] = s2;
		s[2] = s3;
		s[3] = s4;

		for (Student t : s) {
			System.out.println(t.name);
			System.out.println(t.id);
			System.out.println(t.percentage);
			
		}

	}

}
