package com.accenture.lkm.collection.assignment.comparator;

import java.util.Collections;
import java.util.List;

public class CourseService {

	

	public void printAllCoursesFeesSorted(List<Course> courses) {

		Collections.sort(courses,new SortByFeesComparator());
		
		courses.stream().forEach(x->System.out.println("Course is"+x.getCourseName()+" "+": Course fee is RS. "+x.getCourseFee()));

		

	}

	public void printAllCoursesNamesSorted(List<Course> courses) {

		Collections.sort(courses,new SortByNameComparator());

		courses.stream().forEach(x->System.out.println("Course is"+x.getCourseName()+" "+": Course fee is RS. "+x.getCourseFee()));

	}

}
