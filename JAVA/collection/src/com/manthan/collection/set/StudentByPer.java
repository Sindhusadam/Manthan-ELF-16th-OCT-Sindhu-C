package com.manthan.collection.set;

import java.util.Comparator;

public class StudentByPer implements Comparator<Student>{


	public int compare(Student o1, Student o2) {
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

	}

}
