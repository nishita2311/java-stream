package exceptions;

public class TestExceptionPropagation {
	void method1()
	{
		int data=50/0;
		//throw new java.io.IOException("device error");
	}
	void method2()
	{
		method1();
	}
	void method3()
	{
		try
		{
			method2();
		}
		catch(Exception e) {
			System.out.println("exception handled");
		}
	}
	public static void main(String[] args) throws Exception {
		TestExceptionPropagation t= new TestExceptionPropagation();
		t.method3();
	}

}
