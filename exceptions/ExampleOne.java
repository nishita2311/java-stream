package exceptions;

public class ExampleOne {
	public static void main(String[] args) {
	
		try
		{
			int data=25/5;
			System.out.println(data);
			//System.exit(0);
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("not reachable");
		}catch(Exception e1)
		{
			e1.printStackTrace();
		}
		finally
		{
			System.out.println("in finally");
		}
		System.out.println("out of finally");		
		}
}
