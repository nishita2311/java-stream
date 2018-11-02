package dayThree;

import java.util.ArrayList;

public class StudentTester {
	
	public static void main(String[] args) {
		Student s1=new Student(101,"Rakesh",23,"87");
		Student s2=new Student(102,"Prakash",24,"85");
		Student s3=new Student(103,"Jayesh",21,"89");
		Student s4=new Student(104,"Manish",33,"98");
		
		ArrayList<String> student1=new ArrayList<>();
		student1.add(s1.student_marks);
		student1.add(s2.student_marks);
		student1.add(s3.student_marks);
		student1.add(s4.student_marks);
		System.out.println(student1);
		
		ArrayList<Student> student2=new ArrayList<>();
		student2.add(s1);
		student2.add(s2);
		student2.add(s3);
		student2.add(s4);
		for(Student s:student2)
		{
			System.out.println(s.id);
			System.out.println(s.name);
			System.out.println(s.age);
			System.out.println(s.student_marks);
			System.out.println("-------------------------------------");
		}
	}

}
