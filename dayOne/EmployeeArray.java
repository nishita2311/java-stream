package dayOne;

public class EmployeeArray {
	int age;
	String empname;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public EmployeeArray()
	{
		empname=null;
		age=0;
	}
	public void display()
	{
		System.out.println("Name is:"+this.empname+"  age:"+this.age);
	}

	
	public static void main(String[] args)
	{
		EmployeeArray a=new EmployeeArray();
		a.setEmpname("Rajesh");
		a.setAge(0);
		System.out.println("Employee name "+a.getEmpname());
		System.out.println("Employee age "+a.getAge());
		
	}
	
}
