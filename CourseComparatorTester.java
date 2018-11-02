package com.accenture.lkm.collection.assignment.comparator;

import java.util.ArrayList;
import java.util.List;

import com.accenture.lkm.collection.assignment.comparator.CourseService;

public class CourseComparatorTester {
	public static void main(String[] args) {

		List<Course> courses=new ArrayList<>();
		
		Course t1= new Course(1056,"C#.NET",72,20000);
		Course t2= new Course(1057,"Java",19,40000);
		Course t3= new Course(1058,"C#.NET",30,50000);
		Course t4= new Course(1059,"C#.NET",54,60000);
		Course t5= new Course(1060,"C#.NET",60,70000);
		
		courses.add(t1);
		courses.add(t2);
		courses.add(t3);
		courses.add(t4);
		courses.add(t5);
		
		
		CourseService service=new CourseService();
	service.printAllCoursesFeesSorted(courses);
	service.printAllCoursesNamesSorted(courses);
		
		

	}
}
