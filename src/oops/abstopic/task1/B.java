package oops.abstopic.task1;

public abstract class B extends A
{
	int no2;
	public B()
	{
		no2 = 200;
		System.out.println("B : Default Constructor");
	}
	public void test1() 
	{
		System.out.println("B : test1()");
	}
	public void test2() 
	{
		System.out.println("B : test2()");
	}

	void dispData() 
	{
		System.out.println("NO1 : " + no1 +"\nNo2 : " + no2);
	}
}
