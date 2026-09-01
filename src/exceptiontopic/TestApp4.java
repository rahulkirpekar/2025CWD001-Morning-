package exceptiontopic;

public class TestApp4 
{
	public static void main(String[] args) 
	{
		String value = "abc123";// String---int
		
		int no = Integer.parseInt(value);// NumberFormatException
		
		System.out.println(no+200);// 323
		
	}

}
