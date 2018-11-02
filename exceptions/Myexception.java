package exceptions;

public class Myexception extends Exception{

	String s1;
	Myexception(String str2)
	{
		s1=str2;
	}
	@Override
	public String toString()
	{
		return("Myexception occured:"+s1);
	}
}

	