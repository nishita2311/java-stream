package exceptions;

public class Student {
	int age;
	int weight;
	
	public void validate(Student s1)
	{
		if (s1.age>18 && s1.weight<40)
		{
			System.out.println("valid!!");
		}
		else throw new ArithmeticException("Not valid!!");
	}
	public static void main (String[] args)throws ArithmeticException,NullPointerException {
		/*Student s=new Student();
		s.setAge(10);
		s.setWeight(87);
		s.validate(s);*/
		int b=10/0;throw new ArithmeticException("hello");
	//	String s=null;
		//System.out.println(s.length());
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}

	
}
