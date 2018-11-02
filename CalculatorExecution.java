package dayOneHandson;

public class CalculatorExecution {
	public static void main(String[] args) {
		Calculator c=new Calculator();
		System.out.println("result is "+c.add(10, 10));
		System.out.println("result is "+c.add(10.0, 10.0));
	}

}
