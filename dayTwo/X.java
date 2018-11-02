package dayTwo;

public interface X {
	void method1();
	public default void method2() 
	{
		System.out.println("in default");
		
	}
	public static void method3()
	{
		System.out.println("in static interface method");
	}


}

