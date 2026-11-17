package innerclasstopic.li;

public class A 
{
	private int no = 1000;

	void disp() 
	{
		// Local Innerclass
		class B
		{
			void show() 
			{
				System.out.println(" B --show()---no : " + no);
			}
		}
		B obj = new B();
		obj.show();
	}
	public static void main(String[] args) 
	{
		A obj = new A();
		obj.disp();
	}
}