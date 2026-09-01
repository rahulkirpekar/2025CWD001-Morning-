package exceptiontopic;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		String name = null;
		
		int length = name.length();// NullPointerException
		
		System.out.println("length of String : " + length);
		
	}
}
