package com.accenture.lkm.collection.assignment.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;





public class CourseComparableTester {

public static void main(String[] args) {
	

		//Call print method of service class 
				
	Course c1=new Course(100,"Physics",15,4000);
	Course c2=new Course(101,"Chemistry",10,6000);
	Course c3=new Course(102,"Mathematics",12,7000);
	Course c4=new Course(103,"English",13,8000);
	Course c5=new Course(104,"Biology",15,9000);

			List<Course> list1=new ArrayList<>();
			list1.add(c1);
			list1.add(c2);
			list1.add(c3);
			list1.add(c4);
			list1.add(c5);
			
			System.out.println(list1);
			
			CourseService service=new CourseService();
			service.printAllCoursesSorted(list1);
			
	

	}
}
