package innerclasstopic.ni;

public class A 
{
	private static int no = 100;
	
	// 4. Nested Innerclass
	static class B
	{
		void disp() 
		{
			System.out.println("B : No : " + no);
		}
	}
	public static void main(String[] args) 
	{
		A.B obj = new A.B();
		
		obj.disp();
	}
}
