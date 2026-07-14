package oops.finaltopic;

public class TestApp1 
{
	final int no ;//= 10;
	
	public TestApp1() 
	{
		no = 1000;
	}
	public TestApp1(int no) 
	{
		this.no = no;
	}
	
	public static void main(String[] args) 
	{
		TestApp1 obj = new TestApp1(2000);
		
//		obj.no = 100;
		System.out.println("obj.no : " + obj.no);
//		obj.no = 200;
//		System.out.println("obj.no : " + obj.no);
		
		
		
//		final int no;
		
//		no = 10;
//		System.out.println("No : " + no);

//		no = 20;//C.E
//		System.out.println("No : " + no);
	}
}
