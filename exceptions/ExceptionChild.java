package exceptions;

import java.io.IOException;

class ExceptionParent {
	
void method ()throws IOException
{
	System.out.println("parent");
	
}
 }

public class ExceptionChild extends ExceptionParent
{
	void method()throws IOException{
		System.out.println("in child");
	}
	public static void main(String[] args) {
		ExceptionParent i=new 	ExceptionChild();
		//i.method();
	}
}
