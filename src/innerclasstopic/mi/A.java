package innerclasstopic.mi;

// Outer class
public class A 
{
	// Data Members
	private int no = 1000;
	
	// 1. Member Innerclass
	class B
	{
		void show() 
		{
			System.out.println("B - show() No : " + no);
		}
	}
	public static void main(String[] args) 
	{
		A outA = new A();
		
		A.B objB = outA.new B();
		
		objB.show();
	}
}