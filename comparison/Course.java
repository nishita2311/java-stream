package comparison;

public class Course {
	private int courseId;
private	String courseName;
	private int courseDuration;
	private int courseFee;
	
	public Course( int id, String name,int time,int fee)
	{
		courseId=id;
		courseName=name;
		courseDuration=time;
		courseFee=fee;
		
	}

	public int getCourseId() {
		return courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public int getCourseDuration() {
		return courseDuration;
	}

	public int getCourseFee() {
		return courseFee;
	}

}
