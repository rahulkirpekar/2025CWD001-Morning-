package stringtopic.mutableway;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		StringBuilder sb = new StringBuilder("Royal technosoft");
//		StringBuffer sb = new StringBuffer("Royal technosoft");
		
		for (int i = 0; i < sb.length(); i++) 
		{
			System.out.println("sb.charAt("+i+") : " + sb.charAt(i));
		}
		
	}
}
