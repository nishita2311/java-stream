package dayTwo;

public class Interface implements X {

	@Override
	public void method1() {
		System.out.println("In the overidden abstract method");
		
	}
	@Override
	public void method2()
	{
		System.out.println("in the overriden method2 of default");
	}
	public static void method3()
	{
		System.out.println("in static method 3");
	}
public static void main(String[] args) 
{
	X a=new Interface();
	a.method2();
	Interface.method3();
	X.method3();
}
}
