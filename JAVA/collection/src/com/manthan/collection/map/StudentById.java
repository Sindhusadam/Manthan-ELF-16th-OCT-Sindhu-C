package com.manthan.collection.map;

import java.util.Comparator;

import com.manthan.collection.set.Student;


	public class StudentById implements Comparator<Student> {

		@Override
		public int compare(Student o1, Student o2) {
			if(o1.id > o2.id)
			{
				return 1;
			}
			else if(o1.id < o2.id)
			{
				return -1;
			}
			else {
				return 0;
			}
}
