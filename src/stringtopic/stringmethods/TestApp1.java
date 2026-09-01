package stringtopic.stringmethods;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		//			   0123456789012345	
		String name = "Royal Technosoft";
		
		System.out.println("name.length() : " + name.length());// length of String-16
		
		// length
		
		// charAt
		
		for (int i = 0; i < name.length(); i++) 
		{
			System.out.println("name.charAt("+i+") : " + name.charAt(i));// R
		}
	}
}
