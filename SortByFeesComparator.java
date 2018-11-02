package com.accenture.lkm.collection.assignment.comparator;

import java.util.Comparator;

public class SortByFeesComparator implements Comparator<Course> {

	//TODO
	
	//Override compare method to sort based on course fees
	public int compare(Course o1, Course o2) {
		if (o1.getCourseFee() > o2.getCourseFee())
			return 1;
		else if (o1.getCourseFee() < o2.getCourseFee())
			return -1;
		else
			return 0;
	}

}
