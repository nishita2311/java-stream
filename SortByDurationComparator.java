package com.accenture.lkm.collection.assignment.comparator;

import java.util.Comparator;



public class SortByDurationComparator implements Comparator<Course> {

	//TODO
	public int compare(Course o1, Course o2) {
		if (o1.getCourseDurationInHours() > o2.getCourseDurationInHours())
			return 1;
		else if (o1.getCourseDurationInHours() < o2.getCourseDurationInHours())
			return -1;
		else
			return 0;
	}
	

}
