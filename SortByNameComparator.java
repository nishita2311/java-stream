package com.accenture.lkm.collection.assignment.comparator;

import java.util.Comparator;

public class SortByNameComparator implements Comparator<Course> {

	//TODO
	public int compare(Course o1, Course o2) {
		if ((o1.getCourseName()).compareTo(o2.getCourseName())>0)
			return 1;
		else if ((o1.getCourseName()).compareTo(o2.getCourseName())<0)
			return -1;
		else
			return 0;
	}

}
